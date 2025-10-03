package viikko4.lab;

import java.util.LinkedList;

public class StudentRegister {
    private LinkedList<Student> students = new LinkedList<>();

    public void add(String n, Integer c) {
        /* TODO */ 
        Student newStudent = new Student(n, c);
        students.add(newStudent);
    }

    public LinkedList<Student> searchByName(String q) {
        /* TODO */ 
        LinkedList<Student> qStudents = new LinkedList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(q.toLowerCase())) {
                qStudents.add(student);
            }
        }
        return qStudents;
    }

    public LinkedList<Student> searchCreditsLessThan(int x) {
        /* TODO */
        LinkedList<Student> qStudents = new LinkedList<>();
        for (Student student : students) {
            if (student.getCredits() < x) {
                qStudents.add(student);
            }
        }
        return qStudents;
    }

    public LinkedList<Student> searchCreditsGreaterOrEqual(int x) {
        /* TODO */
        LinkedList<Student> qStudents = new LinkedList<>();
        for (Student student : students) {
            if (student.getCredits() >= x) {
                qStudents.add(student);
            }
        }
        return qStudents;
    }
}