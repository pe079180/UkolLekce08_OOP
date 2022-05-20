package com.engeto.lekce8;

public class ClassOfStudents2 extends ClassOfStudents implements ClassOfStudentsInterface{
    public ClassOfStudents2(String name, String grade, Teacher teacher, StudentList students) {
        super(name, grade, teacher, students);
    }

    @Override
    public String outputFormat() {
        return outputFormat2();
    }
}
