package com.example.section02_structure;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println(div(1,2));
        System.out.println(div(1.,2.));
    }
    private static int div(int a, int b) {
        return a/b;
    }
    private static double div(double a, double b){
        return a/b;
    }
}
