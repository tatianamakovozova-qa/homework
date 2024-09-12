package org.example.homework3;

public class Dot implements Movable{
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public void moveUp(){
        System.out.println(x++);
    }

    @Override
    public void moveDown() {
        System.out.println(x--);
    }

    @Override
    public void moveLeft() {
        System.out.println(y--);
    }

    @Override
    public void moveRight() {
        System.out.println(y++);
        System.out.println();
    }
}
