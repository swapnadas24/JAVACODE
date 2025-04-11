package com.javacode.practice.String;

public class DuplicateCharsInString {

    public static void main(String[] args) {

        String x = "Swapnnamudra Das";
        char x1[] = x.toCharArray();

        int count;
        System.out.println("Duplaicate chars:  ");
        for (int i = 0; i < x1.length; i++) {

            count = 1;
            for (int j = i + 1; j < x1.length; j++) {

                if (x1[i] == x1[j] && x1[i] != ' ') {
                    count++;
                    x1[j] = '0';
                }
            }
            if (count > 1 && x1[i] != '0') {

                System.out.println(x1[i]);

            }
        }
    }
}
