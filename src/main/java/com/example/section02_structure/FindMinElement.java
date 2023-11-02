package com.example.section02_structure;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]) {
            min=array[i];
           //}else{min=min;
            }
        }
        System.out.println(min);
    }
}
