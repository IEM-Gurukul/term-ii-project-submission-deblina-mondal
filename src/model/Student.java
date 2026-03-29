package model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    public Student(int id, String name, int age, String department) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.department = department;
}
    public int getId() {
    return id;

}
public void display() {
    System.out.println(id + " | " + name + " | " + age + " | " + department);
}
}