package com.javacode.practice.String;

public class TotalNoOfPunctuationCharsInString {

    public static void main(String[] args) {

        String x = "Swapnamudr;':.,<>?/*@";
        int count = 0;

        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) == ';' || x.charAt(i) == '.' || x.charAt(i) == ',' || x.charAt(i) == '<'
                    || x.charAt(i) == '>' || x.charAt(i) == '?' || x.charAt(i) == '/' || x.charAt(i) == '*'
                    || x.charAt(i) == '@' || x.charAt(i) == ':') {

                count++;

            }
        }
        System.out.println("total punctuation: " + count);
    }
}
