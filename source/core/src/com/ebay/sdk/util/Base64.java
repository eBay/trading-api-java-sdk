/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ebay.sdk.util;

/**
 * @author cli
 *
 *  Provides encoding of raw bytes to base64-encoded characters, and
 *  decoding of base64 characters to raw bytes.
 *
*/
public class Base64 {

/**
* returns an array of base64-encoded characters to represent the
* passed data array.
*
* @param data the array of bytes to encode
* @return base64-coded character array.
*/
static public char[] encode(byte[] data)
{
    char[] out = new char[((data.length + 2) / 3) * 4];

    //
    // 3 bytes encode to 4 chars.  Output is always an even
    // multiple of 4 characters.
    //
    for (int i=0, index=0; i<data.length; i+=3, index+=4) {
        boolean quad = false;
        boolean trip = false;

        int val = (0xFF & (int) data[i]);
        val <<= 8;
        if ((i+1) < data.length) {
            val |= (0xFF & (int) data[i+1]);
            trip = true;
        }
        val <<= 8;
        if ((i+2) < data.length) {
            val |= (0xFF & (int) data[i+2]);
            quad = true;
        }
        out[index+3] = alphabet[(quad? (val & 0x3F): 64)];
        val >>= 6;
        out[index+2] = alphabet[(trip? (val & 0x3F): 64)];
        val >>= 6;
        out[index+1] = alphabet[val & 0x3F];
        val >>= 6;
        out[index+0] = alphabet[val & 0x3F];
    }
    return out;
}

  /**
   * Decodes a BASE-64 encoded stream to recover the original
   * data. White space before and after will be trimmed away,
   * but no other manipulation of the input will be performed.
   * @param data char[]
   * @return byte[]
   */
  static public byte[] decode(char[] data)
{
    // as input could contain non-BASE64 data (newlines,
    // whitespace of any sort, whatever) we must first adjust
    // our count of USABLE data so that...

    int tempLen = data.length;
    for( int ix=0; ix<data.length; ix++ )
    {
        if( (data[ix] > 255) || codes[ data[ix] ] < 0 )
            --tempLen;  // ignore non-valid chars and padding
    }
    // calculate required length:
    //  -- 3 bytes for every 4 valid base64 chars
    //  -- plus 2 bytes if there are 3 extra base64 chars,
    //     or plus 1 byte if there are 2 extra.

    int len = (tempLen / 4) * 3;
    if ((tempLen % 4) == 3) len += 2;
    if ((tempLen % 4) == 2) len += 1;

    byte[] out = new byte[len];



    int shift = 0;   // # of excess bits stored in accum
    int accum = 0;   // excess bits
    int index = 0;

    // we now go through the entire array (NOT using the 'tempLen' value)
    for (int ix=0; ix<data.length; ix++)
    {
        int value = (data[ix]>255)? -1: codes[ data[ix] ];

        if ( value >= 0 )           // skip over non-code
        {
            accum <<= 6;            // bits shift up by 6 each time thru
            shift += 6;             // loop, with new bits being put in
            accum |= value;         // at the bottom.
            if ( shift >= 8 )       // whenever there are 8 or more shifted in,
            {
                shift -= 8;         // write them out (from the top, leaving any
                out[index++] =      // excess at the bottom for next iteration.
                    (byte) ((accum >> shift) & 0xff);
            }
        }
        // we will also have skipped processing a padding null byte ('=') here;
        // these are used ONLY for padding to an even length and do not legally
        // occur as encoded data. for this reason we can ignore the fact that
        // no index++ operation occurs in that special case: the out[] array is
        // initialized to all-zero bytes to start with and that works to our
        // advantage in this combination.
    }

    // if there is STILL something wrong we just have to throw up now!
    if( index != out.length)
    {
        throw new Error("Miscalculated data length (wrote " + index + " instead of " + out.length + ")");
    }

    return out;
}


//
// code characters for values 0..63
//
static private char[] alphabet =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
        .toCharArray();

//
// lookup table for converting base64 characters to value in range 0..63
//
static private byte[] codes = new byte[256];
static {
    for (int i=0; i<256; i++) codes[i] = -1;
    for (int i = 'A'; i <= 'Z'; i++) codes[i] = (byte)(     i - 'A');
    for (int i = 'a'; i <= 'z'; i++) codes[i] = (byte)(26 + i - 'a');
    for (int i = '0'; i <= '9'; i++) codes[i] = (byte)(52 + i - '0');
    codes['+'] = 62;
    codes['/'] = 63;
}





}

