package com.shao.model;

import java.io.Serializable;

/**
 * Created by ShaoXinming on 2016/11/23.
 */
public class User implements Serializable {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
