import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("\nArrayList: " + list);

        System.out.print("Enter an element to remove: ");
        String remove = sc.nextLine();

        list.remove(remove);

        System.out.println("Updated ArrayList: " + list);

        sc.close();
    }
}