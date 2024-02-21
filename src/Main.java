import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        int choice, id;
        String name, city;
        do {
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|              Students Management            |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|   1: Add Student                            |-----------||");
            System.out.println("\t\t\t||------------|   2: Update Student                         |-----------||");
            System.out.println("\t\t\t||------------|   3: Delete Student                         |-----------||");
            System.out.println("\t\t\t||------------|   4: Display All Student                    |-----------||");
            System.out.println("\t\t\t||------------|   5: Quitter application                    |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("Enter votre choix: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.print("ID : ");
                    id = new Scanner(System.in).nextInt();
                    System.out.print("NAME : ");
                    name = new Scanner(System.in).nextLine();
                    System.out.print("CITY : ");
                    city = new Scanner(System.in).nextLine();
                    DatabaseManager.addStudent(new Student(id, name, city));
                    break;
                case 2:
                    System.out.print("Enter student ID to update: ");
                    id = new Scanner(System.in).nextInt();
                    System.out.print("Enter new name: ");
                    name = new Scanner(System.in).nextLine();
                    System.out.print("Enter new city: ");
                    city = new Scanner(System.in).nextLine();
                    DatabaseManager.updateStudent(new Student(id, name, city));
                    break;
                case 3:
                    System.out.print("Enter student ID to delete: ");
                    id = new Scanner(System.in).nextInt();
                    DatabaseManager.deleteStudent(id);
                    break;
                case 4:
                    System.out.println("All students:");
                    for (Student std : DatabaseManager.getAllStudents()) {
                        System.out.println(std);
                    }
                    break;
            }
        }while (choice != 5) ;
    }
}