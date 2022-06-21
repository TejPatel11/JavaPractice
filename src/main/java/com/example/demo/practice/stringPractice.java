package com.example.demo.practice;

public class stringPractice {
    public static <bool> void main(String[] args) {
            String str = "Learn string handling";
            String allUpper = "LEARN STRING HANDLING";
            boolean isTrue = false;

            //This will return the first char of the string
            char ch1 = str.charAt(0);
            char ch2 = str.charAt(1);
            char ch3 = str.charAt(4);

            if(str.equalsIgnoreCase(allUpper)) {
                isTrue = true;
            }else {
                isTrue = false;
            }

            System.out.println("Character at 0 index is: " + ch1);
            System.out.println("Character at 1 index is: " + ch2);
            System.out.println("Character at 4 index is: " + ch3);

            System.out.println("Are str and allUpper equal: " + isTrue);
        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        int result = str.length() - 1;
        System.out.println("Last index " + result);

        // 2) Using the same string as above, what character is located at the 10th index?
        char res = str.charAt(10);
        System.out.println("Char at 10th index is " + res);

        // 3)Do a check to see if the character at index 10 and 15 the same?
        char res1 = str.charAt(15);
        System.out.println("Char at 15th index is " + res1);
        if (res == res1) {
            System.out.println("Characters are same");
        } else {
            System.out.println("Not same");
        }

        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        String str1 = "LearnL string handling";
        char num1 = str1.charAt(0);
        char num2 = str1.charAt(5);
        boolean result3 = false;
        if (num1 != num2) {
            result3 = true;
            System.out.println("Boolean " + result3);
        } else {
            System.out.println("Boolean " + result3);
        }

        //Check Length
        int length = str.length();
        System.out.println(length);

        //Substring

        String sub = str.substring(0,5);
        System.out.println(sub);

        //StartWith and ends with

        boolean start = (str.startsWith("L")) && (str.endsWith("g"));
        System.out.println(start);

        //UpperCase and LowerCase
        String cas = str.toUpperCase();
        System.out.println("Upper case: " +cas);
        String low = cas.toLowerCase();
        System.out.println("Lower Case: " + low);

    }
}


