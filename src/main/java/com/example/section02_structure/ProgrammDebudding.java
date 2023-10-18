package com.example.section02_structure;

import java.util.Scanner;

public class ProgrammDebudding {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
        if (a > b) {
            var result = "a>b";
            System.out.println(result);
        }
        //
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
//другой вариант
        boolean condition = a > b;
        if (condition) {
            System.out.println("condition=true");
        }
        //
        if(condition || a<b && a>1 || !(b<7)){
            System.out.println("complex condition");
        }
    }

    }

