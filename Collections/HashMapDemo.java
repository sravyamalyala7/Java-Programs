import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            map.put(roll, name);
        }

        System.out.println("\nStudent Details:");
        System.out.println(map);

        System.out.print("\nEnter Roll Number to Search: ");
        int search = sc.nextInt();

        if(map.containsKey(search))
            System.out.println("Student Name: " + map.get(search));
        else
            System.out.println("Student Not Found");

        sc.close();
    }
}