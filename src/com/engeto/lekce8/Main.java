package com.engeto.lekce8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lekce 8 OOP ...");
        Person teacher1 = new Teacher("Petr", "Učitel");
        Teacher teacher2 = new Teacher("Petra", "Učitelka");
        Student student1 = new Student("Petra", "Studentka", 1962, "ID15023");
        Student student2 = new Student("Jarda", "Jagr", 1982, "ID15024");

        StudentList students = new StudentList();
        students.getStudents().add(student1);
        students.getStudents().add(student2);

        ClassOfStudents classOfStudents= new ClassOfStudents("4.C", "4",teacher2, students);
        System.out.println("\n-- task1-- ");
        System.out.println(classOfStudents.outputFormat1());

        System.out.println("\n-- task2-- ");
        System.out.println(classOfStudents.outputFormat2());

        System.out.println("\n-- task3-- ");
        System.out.println(classOfStudents);

    }
}
