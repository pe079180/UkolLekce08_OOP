package com.engeto.lekce8;

public class Student extends Person implements PersonInterface {
    private int yearOfBirth;
    private String ident;

    public Student(String name, String surname, int yearOfBirth, String ident) {
        super(name, surname);
        this.yearOfBirth = yearOfBirth;
        this.ident = ident;
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String toString_orig() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", ident=" + ident +
                '}';
    }

    @Override
    public String toString() {
        return ident + " - " +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'';
    }
}
