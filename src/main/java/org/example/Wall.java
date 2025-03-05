package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double setWidth(double value1) {
        if(value1<0) {
            width=0;
        }else {
            this.width=value1;
        }
        return width;
    }
    public double setHeight(double value2) {
        if(value2<0) {
            height=0;
        }else {
            this.height=value2;
        }
        return height;
    }
    public double getArea(){
        return  width*height;
    }
}
