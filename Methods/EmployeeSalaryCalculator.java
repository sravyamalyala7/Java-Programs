import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static double calculateSalary(double basicSalary) {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        return grossSalary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double grossSalary = calculateSalary(basicSalary);

        System.out.println("\n----- Employee Details -----");
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + (basicSalary * 0.20));
        System.out.println("DA (10%)      : " + (basicSalary * 0.10));
        System.out.println("Gross Salary  : " + grossSalary);

        sc.close();
    }
}