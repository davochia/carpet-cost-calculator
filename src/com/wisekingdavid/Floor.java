package com.wisekingdavid;
/*
* This application calculate the cost of carpet per square meter
* Amount needed to complete the area of of the intended floor
* */

public class Floor {
    private double width, length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0 || length < 0){
            this.width = 0;
            this.length = 0;
        }
    }

//    public Floor(){
//        this(0, 0);
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.length * this.width;
    }
}
