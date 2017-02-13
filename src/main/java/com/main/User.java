package com.main;

/**
 * Created by yuting on 2017/1/19.
 */
public class User {
    Long id;
    Object name;
    Object age;

    public Long getId() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public Object getAge() {
        return age;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setAge(Object age) {
        this.age = age;
    }

}
