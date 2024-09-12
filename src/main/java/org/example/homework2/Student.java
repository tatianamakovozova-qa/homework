package org.example.homework2;

public class Student implements Printable{
    private String name;
    private int recordBook;
    private int gpa;

    public void setName(String name){
        this.name = name;
    }
    public void setRecordBook(int recordBook){
        this.recordBook = recordBook;
    }
    public void setGpa(int gpa){
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }
    public int getRecordBook(){
        return this.recordBook;
    }

    public int getGpa() {
        return this.gpa;
    }
    @Override
    public void print(){
        System.out.println("Имя студента: " + this.name);
        System.out.println("Номер зачетной книжки: " + this.recordBook);
        System.out.println("Средний балл: " + this.gpa);
        System.out.println();
    }
}
