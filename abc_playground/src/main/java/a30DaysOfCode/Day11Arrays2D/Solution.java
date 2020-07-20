package a30DaysOfCode.Day11Arrays2D;
import java.util.Scanner;

public class Solution {

    public static void sumHourglass(int[][] arr) {
        int sumHgMax=-999;
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 4; n++) {
                int sum1 = arr[m][n] + arr[m][n + 1] + arr[m][n + 2];
                // System.out.println(arr[m][n]);
                int sum2 = arr[m + 1][n + 1];
                //System.out.println(arr[m+1][n]);
                int sum3 = arr[m + 2][n] + arr[m + 2][n + 1] + arr[m + 2][n + 2];
                // System.out.println(arr[m+2][n]);
                int sumH = sum1 + sum2 + sum3;

                if (sumH > sumHgMax) {
                    sumHgMax = sumH;
                }
            }
        }
        System.out.println(sumHgMax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        sumHourglass(arr);

        scanner.close();
    }
}
