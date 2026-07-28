import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    int[] marks = new int[5];

    public void getDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public void calculateGrade() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = total / 5.0;

        System.out.println("\n------ Student Report ------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Student student = new Student();

        student.getDetails();
        student.calculateGrade();
    }
}