import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter element " + i + ": ");
            set.add(sc.nextInt());
        }

        System.out.println("HashSet: " + set);

        System.out.print("Enter element to search: ");
        int value = sc.nextInt();

        if(set.contains(value))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}