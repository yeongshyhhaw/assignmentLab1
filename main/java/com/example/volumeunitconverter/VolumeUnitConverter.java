package com.example.volumeunitconverter;

public class VolumeUnitConverter {
    public double convertLitersToFluidOunces(double value){
        return value*33.824;
    }

    public double convertLitersToQuarts(double value){
        return value*1.0570;
    }

    public double convertLitersToGallons(double value){
        return value*0.2642;
    }

    public double convertLitersToImperialGallons(double value){
        return value*0.2200;
    }
}
