package com.javacode.interviewQuestions;

public class Test {

    public static void main(String[] args) {

        String x = "Swapnamudra Das";

        char x1[] = x.toLowerCase().toCharArray();

        int count;

        for (int i = 0; i < x1.length; i++) {

            count = 1;

            for (int j = i + 1; j < x1.length; j++) {

                if (x1[i] == x1[j] && x1[i] != ' ') {

                    count++;
                    x1[j] = 0;
                }
            }
            if (count > 1 && x1[i] != 0) {

                System.out.println(x1[i] + ":" + count);
            }
        }

    }
}