package com.example.udemy.level_7_senior;

import java.util.Scanner;

class TemperatureData {
    private double temperatureC;
    private double temperatureF;

    /*public TemperatureData(double temperatureC, double temperatureF) {
        this.temperatureC = temperatureC;
        this.temperatureF = temperatureF;
    }*/

    public double getTemperatureC() {
        System.out.println("Enter C: ");
        temperatureC=new Scanner(System.in).nextDouble();
        return temperatureC;
    }

    public double getTemperatureF() {
        System.out.println("Enter F: ");
        temperatureF=new Scanner(System.in).nextDouble();
        return temperatureF;
    }
}
