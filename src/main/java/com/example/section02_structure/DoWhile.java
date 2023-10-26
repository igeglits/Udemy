package com.example.section02_structure;

public class DoWhile {
    public static void main(String[] args) {
        {
            int i = 100;
            while (i >= 1) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }
        {
            int i = 100;
            do {
                System.out.print(i-- + " ");
            } while (i >= 1);
        }
        System.out.println();
    }
}
