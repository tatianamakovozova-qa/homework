package org.example.homework1;

public class Book {
    private String name;
    private String author;
    private int year;

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }

    public int getYear() {
        return year;
    }
}
