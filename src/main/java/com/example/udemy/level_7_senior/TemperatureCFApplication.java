package com.example.udemy.level_7_senior;

public class TemperatureCFApplication {
    public static void main(String[] args) {


        TemperatureCFConverter converter=new TemperatureCFConverter();
        TemperatureData temperatureData=new TemperatureData();
        System.out.println("If C = "+ temperatureData.getTemperatureC()+" "+"F = "+converter.converterToF(temperatureData));
        System.out.println("If F = "+temperatureData.getTemperatureF()+" "+"C = "+converter.converterToC(temperatureData));
    }
}
