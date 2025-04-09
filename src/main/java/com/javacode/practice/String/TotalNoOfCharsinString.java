package com.javacode.practice.String;

public class TotalNoOfCharsinString {

    public static void main(String[] args) {

        String x = "Swapna DTsfgrk";
        char ch;
        int count = 0;

        for (int i = 0; i < x.length(); i++) {

            ch = x.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                count++;
            }
        }
        System.out.print(" " + count);

    }
}