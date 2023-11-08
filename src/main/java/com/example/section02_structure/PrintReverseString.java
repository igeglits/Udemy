package com.example.section02_structure;

import java.util.Arrays;

public class PrintReverseString {
    public static void main(String[] args) {
        String s ="!dlrow olleH";
        for (int i = s.length()-1; i >=0; i--) {//i = s.length()-1; i >=0; i-- т.к. выводим в обратном порядке
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
