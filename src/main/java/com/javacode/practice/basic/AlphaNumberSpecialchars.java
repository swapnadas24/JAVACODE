package com.javacode.practice.basic;

public class AlphaNumberSpecialchars {

    public static void main(String[] args) {

        String s = "ab#4h&%*678";

        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {

                alphabet.append(ch);
            } else if (Character.isDigit(ch)) {

                number.append(ch);
            } else if ("#&%*".indexOf(ch) >= 0) {

                chars.append(ch);
            }
        }

        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(chars);
    }
}
