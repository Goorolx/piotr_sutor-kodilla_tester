package a30DaysOfCode.Day16Exceptions;

import java.util.Scanner;

public class Solution {

    public static void stint (String s){
        try {
            Integer i = Integer.parseInt(s);
            System.out.println(i);
        }catch (Exception e){
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        stint(S);
    }
}

