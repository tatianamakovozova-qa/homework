package org.example;

import org.example.homework1.Book;
import org.example.homework2.Student;
import org.example.homework3.Dot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Гранатовый браслет");
        book1.setAuthor("А.И.Куприн");
        book1.setYear(1910);
        book1.display();

        Student student = new Student();
        student.setName("John Doe");
        student.setRecordBook(123456);
        student.setGpa(5);
        student.print();

        Dot dot = new Dot();
        dot.setX(5);
        dot.setY(1);
        dot.moveUp();
        dot.moveDown();
        dot.moveLeft();
        dot.moveRight();





    }
}