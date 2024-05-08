package com.example.homew5;

public class Car {
    private String name;
    private String carDescription;
    private int carResourse;

    public Car(String name, String carDescription, int carResourse) {
        this.name = name;
        this.carDescription = carDescription;
        this.carResourse = carResourse;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCarDescription(String carDescription){
        this.carDescription = carDescription;
    }
    public int getCarResource(){
        return carResourse;
    }
}
