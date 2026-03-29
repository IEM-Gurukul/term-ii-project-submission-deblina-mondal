package service;

import model.Student;

public interface StudentService {

    void addStudent(Student s);
    void viewStudents();
    void searchStudent(int id);
    void deleteStudent(int id);
}
