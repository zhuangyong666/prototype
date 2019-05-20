package com.bsoft.shallow;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 10:00
 **/
public class Person implements Cloneable{
    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
