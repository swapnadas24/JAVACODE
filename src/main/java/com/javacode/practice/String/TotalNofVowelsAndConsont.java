package com.javacode.practice.String;

public class TotalNofVowelsAndConsont {

    public static void main(String[] args) {
        // total no. of vowels
        String x = "SWAPnAEIoundreuii";
        String x1 = x.toLowerCase();

        char ch;
        int Vcount = 0;
        int Ccount = 0;

        for (int i = 0; i < x1.length(); i++) {

            ch = x1.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                Vcount++;
            } else if (ch > 'a' && ch < 'z') {

                Ccount++;
            }

        }
        System.out.println("Vowel: " + Vcount);
        System.out.println("Consonant: " + Ccount);
    }
}
