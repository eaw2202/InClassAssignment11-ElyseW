package com.elysewarren.inclassassignment11_elysew;

/**
 * Created by elysewarren on 4/17/17.
 */

public class Dog {
    public String id;
    public String name;
    public int age;
    public boolean alive;

    public Dog() {
    }

    public Dog(String id, String name, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}