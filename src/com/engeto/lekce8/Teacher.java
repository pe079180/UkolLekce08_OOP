package com.engeto.lekce8;

public class Teacher extends Person implements PersonInterface {

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }
}
