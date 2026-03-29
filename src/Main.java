

import service.StudentManager;
import service.StudentService;
import model.Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService manager = new StudentManager();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            try {
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        try {
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Department: ");
                            String dept = sc.nextLine();

                            manager.addStudent(new Student(id, name, age, dept));

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. ID and Age must be numbers.");
                            sc.nextLine(); // clear buffer
                        }
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        try {
                            System.out.print("Enter ID to search: ");
                            int sid = sc.nextInt();
                            manager.searchStudent(sid);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid ID. Please enter a number.");
                            sc.nextLine();
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Enter ID to delete: ");
                            int did = sc.nextInt();
                            manager.deleteStudent(did);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid ID. Please enter a number.");
                            sc.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric menu choice.");
                sc.nextLine(); 
            }
        }
    }
}