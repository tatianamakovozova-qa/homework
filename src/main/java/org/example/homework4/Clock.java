package org.example.homework4;

public class Clock implements Readable{
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours){
        this.hours = hours;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void tick(){
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
    }

    @Override
    public void readTime() {
        System.out.println("Текущее время " + hours + ":" + minutes + ":" + seconds);
        System.out.println();
    }
}
