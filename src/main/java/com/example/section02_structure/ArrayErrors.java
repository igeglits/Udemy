package com.example.section02_structure;

public class ArrayErrors {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[-1]);
        System.out.println(array[500]);
        System.out.println(array[5]);
    }
}
