/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HackerRankCodingChallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {return 6;}



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int result;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            result = hourglassSum(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();
        }
        scanner.close();
        System.out.println(result);
    }
}
