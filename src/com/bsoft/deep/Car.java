package com.bsoft.deep;

import java.io.Serializable;

/**
 * @ClassName: Car
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-20 10:18
 **/
public class Car implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
