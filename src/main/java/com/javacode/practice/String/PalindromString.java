package com.javacode.practice.String;

public class PalindromString {

    public static void main(String[] args) {

        String x = "Kayak";
        String x1 = x.toLowerCase();

        String rev = "";

        for (int i = 0; i < x1.length(); i++) {

            rev += x1.charAt(i);

        }
        if (x1.equals(rev)) {
            System.out.println("is Palindrom: " + rev);
        } else {
            System.out.println("not palindrom: " + rev);
        }
    }

}
