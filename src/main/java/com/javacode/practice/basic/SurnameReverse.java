package com.javacode.practice.basic;

public class SurnameReverse {
    public static void main(String[] args) {

        String s1 = "Rahul Sharma";
        String s2[] = s1.split(" ");
        String s3 = " ";
        char ch;
        String strrev = " ";
        for (int i = 0; i < s2[1].length(); i++) {

            ch = s2[1].charAt(i);
            strrev = ch + strrev;

            s3 = Character.toUpperCase(strrev.charAt(i)) + strrev.substring(1).toLowerCase();
        }
        System.out.println(s2[0] + " " + s3);
    }
}
