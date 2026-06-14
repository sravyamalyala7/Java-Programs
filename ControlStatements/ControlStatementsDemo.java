import java.util.Scanner;

public class ControlStatementsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // If-Else Statement
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // Switch Statement
        System.out.print("\nEnter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }

        // For Loop
        System.out.println("\nNumbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}