package a30DaysOfCode.Day10Binary;

import java.util.Scanner;

public class Solution {

    private int maxConsecutiveOnes = 0;
    private boolean previousOne = true;

    public Solution(){} ;

    public void setMaxConsecutiveOnes(int maxConsecutiveOnes) {
        this.maxConsecutiveOnes = maxConsecutiveOnes;
    }

    public void contChecker(int n) {
        String b = Integer.toBinaryString(n);
        System.out.println(b);
        boolean prevOne = true;
        int consecutiveOnes = 0;
        int consecutive = 0;
        for (int i = 0; i < b.length(); i++) {
            String c = Character.toString(b.charAt(i));
            if (c.equals("1")) {
                if (prevOne) {
                    consecutive++;
                    prevOne = true;
                    if (consecutive > consecutiveOnes)
                        consecutiveOnes = consecutive;
                } else {
                    consecutive = 1;
                    prevOne = true;
                }
            } else prevOne = false;
            setMaxConsecutiveOnes(consecutiveOnes);
        }

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Solution s = new Solution();
        s.contChecker(n);
        System.out.println(s.maxConsecutiveOnes);
        scanner.close();
    }
}