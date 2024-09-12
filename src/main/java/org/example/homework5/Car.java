package org.example.homework5;

public class Car  implements Drivable{
    private String car;
    private String model;
    private int year;

    public void setCar(String car){
        this.car = car;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getCar(){
        return this.car;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + car + model + year +" года выпуска пришел в движение.");
    }
    @Override
    public void drive(int distance) {
        System.out.println("Атомобиль проехал " + distance + "км.");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль приехал к месту назначения.");

    }

}
