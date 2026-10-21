import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Count Students");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    students.add(sc.nextLine());
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("Students: " + students);
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    System.out.println(students.contains(name)
                            ? "Student found!" : "Student not found!");
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String remove = sc.nextLine();
                    System.out.println(students.remove(remove)
                            ? "Student deleted!" : "Student not found!");
                    break;

                case 5:
                    System.out.println("Total students: " + students.size());
                    break;

                default:
                    System.out.println("Invalid choice!");
                    sc.close();
                    return;
            }
        }
    }
}