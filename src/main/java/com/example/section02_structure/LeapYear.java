package com.example.section02_structure;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Введи год");
        var year = new Scanner(System.in).nextInt();
        String result;
        if (year % 400 == 0 || year % 4 == 0) {
            result = "Високосный год";
        } else if (year % 100 ==0) {
            result = "Невисокосный год";
        } else {
            result = "Невисокосный год";
        }
        System.out.println(result);
    }
}
