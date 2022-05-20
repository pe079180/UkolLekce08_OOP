package com.engeto.lekce8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassOfStudents {
    private String name;
    private String grade;
    private Teacher teacher;
    private StudentList students;

    public ClassOfStudents(String name, String grade, Teacher teacher, StudentList students) {
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        String result;
        result = "ClassOfStudents = {\n";
        result += "Name: " + name + "\nGrade: " + grade + "\n";
        result += teacher.toString() + "\n";
        result += students.toString() + "\n";
        result += "}\n";
        return result;
    }

    /**
     * format 1
     * Třída: 4.C (ročník: 4)
     * Třídní učitel: Novák, Jan
     * Počet studentů: 3
     *
     * ####################################
     * # 1 # ID001 - Petr Svoboda (2011)
     * # 2 # ID123 - Milan Říha (2010)
     * # 3 # ID345 - Jindřich Nový (2012)
     */
    public String outputFormat1() {
        String hashLine = "####################################";
        String result = hashLine + "\n";
        result = result + "Třída: " + name + " (ročník: " + grade + ")" + "\n";
        result = result + "Třídní učitel: " + teacher.getSurname() + ", " + teacher.getName() + "\n";
        result = result + "Počet studentů: " + students.size() + "\n";
        result = result + "\n";
        result = result + hashLine + "\n";
        for (int i = 0; i < students.size(); i++) {
            result += "# " + (i + 1) + " # " +
                    students.getStudent(i).getIdent() + " -  " +
                    students.getStudent(i).getName() + " " +
                    students.getStudent(i).getSurname() + " (" +
                    students.getStudent(i).getYearOfBirth() + ")" + "\n";
        }


        return result;

    }

    /**
     * format 2
     * 4.C, Jan Novák
     * ID001, Petr Svoboda
     * ID123, Milan Říha
     * ID345, Jindřich Nový
     */
    public String outputFormat2() {
        String result;
        result = name + ", " + teacher.getName() + " "+ teacher.getSurname() + "\n";
        for (int i = 0; i < students.size(); i++) {
            result += students.getStudent(i).getIdent() + ",  " +
                    students.getStudent(i).getName() + " " +
                    students.getStudent(i).getSurname()  + "\n";
        }

        return result;

    }

    /**
     * format 3
     * my format
     * uses standard toString() method
     */
    public String outputFormat3() {
        return toString();
    }

    public void exportToFile(String fileName) throws Exception {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
                    writer.println(outputFormat3());

        } catch (IOException e) {
            throw new Exception("Error writing to : " + fileName  + ": " + e.getLocalizedMessage());
        }
    }

}

