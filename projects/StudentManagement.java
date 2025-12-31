package java_prog.projects;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student1> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student1(roll, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        System.out.println("Roll\tName\tMarks");
                        for (Student1 s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student1 s : students) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Student Found:");
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to Delete: ");
                    int deleteRoll = sc.nextInt();

                    Iterator<Student1> itr = students.iterator();
                    boolean deleted = false;

                    while (itr.hasNext()) {
                        Student1 s = itr.next();
                        if (s.rollNo == deleteRoll) {
                            itr.remove();
                            deleted = true;
                            break;
                        }
                    }

                    if (deleted) {
                        System.out.println("Student Deleted Successfully.");
                    } else {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
class Student1 {
    int rollNo;
    String name;
    int marks;

    Student1(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(rollNo + "\t" + name + "\t" + marks);
    }
}
