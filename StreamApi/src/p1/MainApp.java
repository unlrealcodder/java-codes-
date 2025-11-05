package p1;

import java.util.ArrayList;
import java.util.List;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    int getRoll() {
        return roll;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return roll + " -> " + name;
    }
}

public class MainApp {
    public static void main(String[] args) {

        List<Student> allStudents = new ArrayList<>();

        allStudents.add(new Student(1, "Mahesh"));
        allStudents.add(new Student(2, "Gaurav"));
        allStudents.add(new Student(3, "Ritik"));

        // ✅ Using Stream to print only names
        allStudents.stream()
                   .forEach(ref -> System.out.println(ref.getName()));

        System.out.println("========================");

        // ✅ Using Stream to print roll + name
        allStudents.stream()
                   .forEach(s -> System.out.println(s.getRoll() + " -> " + s.getName()));

        System.out.println("========================");

        // ✅ Traditional for-each
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }
}
