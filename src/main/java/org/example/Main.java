package org.example;

import org.example.homework1.Book;
import org.example.homework2.Student;
import org.example.homework3.Dot;
import org.example.homework4.Clock;
import org.example.homework5.Car;

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

        Clock clock = new Clock();
        clock.setHours(16);
        clock.setMinutes(40);
        clock.setSeconds(50);
        clock.tick();
        clock.readTime();

        Car car = new Car();
        car.setCar("Молния ");
        car.setModel("Маквин ");
        car.setYear(2006);
        car.start();
        car.drive(50);
        car.stop();
    }
}