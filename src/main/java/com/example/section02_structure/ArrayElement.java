package com.example.section02_structure;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        System.out.println(array[0]);//выбираем первый элемент массива. Начало отсчета с 0

        array[0]=45;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[1]);

    }
}

