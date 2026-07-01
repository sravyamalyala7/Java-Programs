import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + obj.add(a, b));

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Sum = " + obj.add(x, y, z));

        sc.close();
    }
}