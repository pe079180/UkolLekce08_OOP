package com.engeto.lekce8;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "students=" + students.toString() +
                '}';
    }

    public Student getStudent( int i){
        return students.get(i);
    }

    public int size() {
        return students.size();
    }
}
