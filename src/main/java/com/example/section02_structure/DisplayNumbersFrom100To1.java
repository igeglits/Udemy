package com.example.section02_structure;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        var from =100;
        var to =1;
        var step=1;
        for (var i=from; i>=to; i-=step){
            System.out.println(i);
        }
    }
}
