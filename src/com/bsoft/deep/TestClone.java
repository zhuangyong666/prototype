package com.bsoft.deep;

/**
 * @ClassName: TestClone
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 10:32
 **/
public class TestClone {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.setName("zz");
        Car car1 = new Car();
        car1.setName("bmw");
        person1.setCar(car1);
        Person person2 = (Person) person1.clone();
        System.out.println(person2.getCar() == person1.getCar());

    }
}
