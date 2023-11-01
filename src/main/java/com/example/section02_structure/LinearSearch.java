package com.example.section02_structure;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 60;//если данный элемент в массиве и каков его индекс

        var index = -1;//задаем индикатор для случая, когда такого элемента нет в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;//индикатор получает индекс соответствующий индексу элемента
                break;
            }
        }
        System.out.println(index);//выводим индикатор
    }
}
