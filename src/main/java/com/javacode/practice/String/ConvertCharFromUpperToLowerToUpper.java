package com.javacode.practice.String;

public class ConvertCharFromUpperToLowerToUpper {

    public static void main(String[] args) {

        String x = "sjhddjshjAHJSHFJHSJ";
        StringBuffer x1 = new StringBuffer(x);

        for (int i = 0; i < x1.length(); i++) {

            if (Character.isLowerCase(x.charAt(i))) {

                x1.setCharAt(i, Character.toUpperCase(x.charAt(i)));
            } else if (Character.isUpperCase(x.charAt(i))) {

                x1.setCharAt(i, Character.toLowerCase(x.charAt(i)));
            }
        }
        System.out.println(x1);

    }
}
