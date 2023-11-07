package com.example.udemy.level_7_senior;

class TemperatureCFConverter {
    public double converterToF(TemperatureData temperatureData){
        return (temperatureData.getTemperatureC()*1.8)+32;
    }
    public double converterToC(TemperatureData temperatureData){
        return (temperatureData.getTemperatureF()-32)/1.8;
    }
}
