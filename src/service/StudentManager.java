package service;

import model.Student;
import java.util.ArrayList;

public class StudentManager implements StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    @Override
public void addStudent(Student s) {
    students.add(s);
}

@Override
public void viewStudents() {
    for(Student s : students){
        s.display();
    }
}
  @Override
public void searchStudent(int id) {
    for(Student s : students){
        if(s.getId() == id){
            s.display();
            return;
        }
    }
}

@Override
public void deleteStudent(int id) {
    students.removeIf(s -> s.getId() == id);
}
}