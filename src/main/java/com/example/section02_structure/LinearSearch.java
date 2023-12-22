package com.example.section02_structure;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 90;//если данный элемент в массиве и каков его индекс
        var index = -1;//задаем индикатор для случая, когда такого элемента нет в массиве
        LinearSearch linearSearch = new LinearSearch();

        //index = iterativeIndex(array, query, index);
        System.out.println(iterativeIndex(array, query, index));//выводим индикатор

        //index = linearSearch.recursionIndex(array, query, 0);
        System.out.println(linearSearch.recursionIndex(array, query, 0));

        //index = linearSearch.recursionIndex2(array, query, array.length - 1, 0);
        System.out.println(linearSearch.recursionIndex2(array, query, array.length - 1, 0));
    }

    public static int iterativeIndex(int[] array, int query, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;//индикатор получает индекс соответствующий индексу элемента
                break;
            }
        }
        return index;
    }

    public int recursionIndex(int[] array, int query, int index) {
        if (index >= array.length) {
            return -1;
        } else if
        (array[index] == query) {
            return array[index];
        } else {
            return recursionIndex(array, query, index + 1);
        }
    }

    public int recursionIndex2(int[] array,
                               int query,
                               int index, int i) {
        if (index < 0) {
            return -1;
        } else {
            index = recursionIndex2(array, query, (array.length - ++i),i);
            return (array[index] == query) ? index : recursionIndex2(array, query, (array.length - 1),i);
        }
    }
}
