package com.engeto.lekce8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lekce 8 OOP ...");
        Teacher teacher1 = new Teacher("Petr", "Učitel");
        Teacher teacher2 = new Teacher("Petra", "Učitelka");
        Student student1 = new Student("Petra", "Studentka", 1962, "ID15023");
        Student student2 = new Student("Jarda", "Jagr", 1982, "ID15024");

        StudentList students = new StudentList();
        students.getStudents().add(student1);
        students.getStudents().add(student2);

        ClassOfStudents classOfStudents = new ClassOfStudents("4.C", "4", teacher1, students);
        ClassOfStudents2 classOfStudents2 = new ClassOfStudents2("3.A", "3", teacher2, students);

        System.out.println("\n-- task1-- ");
        System.out.println(classOfStudents.outputFormat1());

        System.out.println("\n-- task2-- ");
        System.out.println(classOfStudents.outputFormat2());

        System.out.println("\n-- task3 - my own format-- ");
        System.out.println(classOfStudents.outputFormat3());

        // output into file
        try {
            classOfStudents.exportToFile("class_of_students_list.txt");
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        // print class of students by  menthod from interface
        System.out.println(classOfStudents2.outputFormat());

    }
}
