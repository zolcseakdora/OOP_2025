package oop.labor03.lab3_extra;
import oop.labor03.lab3_extra.enums.*;
import oop.labor03.lab3_extra.models.*;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // Diákok létrehozása
        Student student1 = new Student("AVLMO7", "Anne", "Bell", Major.Information_Science);
        Student student2 = new Student("KHI890", "Dora", "Zolcseak", Major.Computer_science);
        Student student3 = new Student("KNJ89G", "Mate", "Mihalydeak", Major.Automation_and_applied_informatics);

        // Tanárok létrehozása
        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.Docent, Department.Mathematics_Informatics);
        Teacher teacher2 = new Teacher("Peter", "Black", Degree.Professor, Department.Applied_linguistics);

        // Kurzus létrehozása
        Course course1 = new Course("MB_INFO200", 5, DayOfWeek.FRIDAY);

        // Tanár hozzárendelése a kurzushoz
        course1.assignTeacher(teacher1);

        // Diákok beiratkozása a kurzusra
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);

        // A kurzus részleteinek kiírása
        System.out.println(course1);
    }
}

