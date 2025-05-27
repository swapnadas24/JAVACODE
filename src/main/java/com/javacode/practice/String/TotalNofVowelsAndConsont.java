package com.javacode.practice.String;

public class TotalNofVowelsAndConsont {

    public static void main(String[] args) {
        // total no. of vowels
        String x = "SWAPnAEIoundreuii";

        char ch;
        int Vcount = 0;
        int Ccount = 0;

        for (int i = 0; i < x.length(); i++) {

            ch = x.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {

                Vcount++;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                Ccount++;
            }

        }
        System.out.println("Vowel: " + Vcount);
        System.out.println("Consonant: " + Ccount);
    }
}
