import java.util.Scanner;

class StudentS {
    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextDouble();

        s.display();
        sc.close();
    }
}
