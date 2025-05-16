package com.javacode.practice.basic;

public class ReveseCharsInOddWay {

    public static void main(String[] args) {

        // Output: ini123megpac
        String x = "cap123gemini";
        char x1[] = x.toCharArray();

        int left = 0;
        int right = x1.length - 1;

        while (left < right) {

            if (!Character.isLetter(x1[left])) {
                left++;
            } else if (!Character.isLetter(x1[right])) {
                right--;
            } else {
                char temp = x1[left];
                x1[left] = x1[right];
                x1[right] = temp;

                left++;
                right--;
            }
        }
        String reverse = new String(x1);
        System.out.println(reverse);
    }
}
