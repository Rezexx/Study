package com.gupaoedu.pattern.prototype.simpleclone;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototypeA implements Prototype{

    private String name;
    private int age;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() {
        ConcretePrototypeA concretePrototypeB = new ConcretePrototypeA();
        concretePrototypeB.hobbies = this.hobbies;
        concretePrototypeB.name = this.name;
        concretePrototypeB.age = this.age;
        return concretePrototypeB;
    }
}
