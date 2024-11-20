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

package com.ebay.sdk.helper;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * An easy interface to read numbers and strings from
 * standard input
 *
 * @author Cay Horstmann. Modified by Weijun Li of eBay to make it to work on Linux
 * @version 1.01 15 Feb 1996
 */

public class ConsoleUtil {
    /**
     * print a prompt on the console
     *
     * @param prompt the prompt string to display
     */

    public static void printPrompt(String prompt) {
        System.out.println(prompt + " ");
        System.out.flush();
    }

    /**
     * read a string from the console. The string is
     * terminated by a newline
     *
     * @return the input string (without the newline)
     */

    public static String readString() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        String rs = reader.readLine();
        if (rs == null)
            rs = "";
        return rs.trim();
    }

    /**
     * read a string from the console. The string is
     * terminated by a newline
     *
     * @param prompt the prompt string to display
     * @return the input string (without the newline)
     */

    public static String readString(String prompt) throws IOException {
        printPrompt(prompt);
        return readString();
    }

    /**
     * read an integer from the console. The input is
     * terminated by a newline
     *
     * @param prompt the prompt string to display
     * @return the input value as an int
     * @throws NumberFormatException if bad input
     */

    public static int readInt(String prompt) throws IOException {
        while (true) {
            printPrompt(prompt);
            try {
                return Integer.valueOf(readString().trim()).intValue();
            } catch (NumberFormatException e) {
                System.out.println("Not an integer. Please try again!");
            }
        }
    }

    /**
     * read a floating point number from the console.
     * The input is terminated by a newline
     *
     * @param prompt the prompt string to display
     * @return the input value as a double
     * @throws NumberFormatException if bad input
     */

    public static double readDouble(String prompt) throws IOException {
        while (true) {
            printPrompt(prompt);
            try {
                return Double.valueOf(readString().trim()).doubleValue();
            } catch (NumberFormatException e) {
                System.out.println(
                    "Not a floating point number. Please try again!");
            }
        }
    }
}
