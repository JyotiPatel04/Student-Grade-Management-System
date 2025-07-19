import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentOperations op = new StudentOperations();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: op.addStudent(); break;
                case 2: op.displayAllStudents(); break;
                case 3: op.searchStudentById(); break;
                case 4: op.saveToFile(); break;
                case 5: op.loadFromFile(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 0);
    }
}

