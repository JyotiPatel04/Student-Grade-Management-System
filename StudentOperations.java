import java.util.*;
import java.io.*;

interface StudentInterface {
    void addStudent();
    void displayAllStudents();
    void searchStudentById();
    void saveToFile();
    void loadFromFile();
}

public class StudentOperations implements StudentInterface {
    ArrayList<Grade> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            studentList.add(new Grade(id, name, course, marks));
            System.out.println("Student added successfully!\n");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Try again.\n");
            sc.nextLine(); // Clear the buffer
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.\n");
        } else {
            for (Grade g : studentList) {
                g.displayGrade();
                System.out.println("------------------------");
            }
        }
    }

    public void searchStudentById() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Grade g : studentList) {
            if (g.getId() == id) {
                g.displayGrade();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.\n");
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            out.writeObject(studentList);
            System.out.println("Data saved to file successfully!\n");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"))) {
            studentList = (ArrayList<Grade>) in.readObject();
            System.out.println("Data loaded from file.\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file or file not found.");
        }
    }
}

