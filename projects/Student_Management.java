package java_prog.projects;

import java.util.ArrayList;
import java.util.Scanner;


public class Student_Management {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Student> students = new ArrayList<>();

		        int choice;

		        do {
		            System.out.println("\n--- Student Management System ---");
		            System.out.println("1. Add Student");
		            System.out.println("2. View Students");
		            System.out.println("3. Exit");
		            System.out.print("Enter choice: ");

		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    Student s = new Student();

		                    System.out.print("Enter ID: ");
		                    s.setId(sc.nextInt());

		                    sc.nextLine(); // buffer clear
		                    System.out.print("Enter Name: ");
		                    s.setName(sc.nextLine());

		                    System.out.print("Enter Age: ");
		                    s.setAge(sc.nextInt());

		                    System.out.print("Enter Marks: ");
		                    s.setMarks(sc.nextDouble());

		                    students.add(s);
		                    System.out.println("Student added successfully!");
		                    break;

		                case 2:
		                    System.out.println("\n--- Student List ---");
		                    for (Student st : students) {
		                        System.out.println("ID: " + st.getId());
		                        System.out.println("Name: " + st.getName());
		                        System.out.println("Age: " + st.getAge());
		                        System.out.println("Marks: " + st.getMarks());
		                        System.out.println("------------------");
		                    }
		                    break;

		                case 3:
		                    System.out.println("Exiting program...");
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		            }
		        } while (choice != 3);
		        
		        
		        
		        class Student {
		            // 1️⃣ Private variables (Data Hiding)
		            private int id;
		            private String name;
		            private int age;
		            private double marks;

		            // 2️⃣ Setter methods (Controlled access)
		            public void setId(int id) {
		                this.id = id;
		            }

		            public void setName(String name) {
		                this.name = name;
		            }

		            public void setAge(int age) {
		                if (age > 0) {
		                    this.age = age;
		                } else {
		                    System.out.println("Invalid age!");
		                }
		            }

		            public void setMarks(double marks) {
		                if (marks >= 0 && marks <= 100) {
		                    this.marks = marks;
		                } else {
		                    System.out.println("Invalid marks!");
		                }
		            }

		            // 3️⃣ Getter methods (Read access)
		            public int getId() {
		                return id;
		            }

		            public String getName() {
		                return name;
		            }

		            public int getAge() {
		                return age;
		            }

		            public double getMarks() {
		                return marks;
		            }
		        }

	}

}

class Student {
    // 1️⃣ Private variables (Data Hiding)
    private int id;
    private String name;
    private int age;
    private double marks;

    // 2️⃣ Setter methods (Controlled access)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // 3️⃣ Getter methods (Read access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
}

