import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("Linked List: " + list);

        System.out.print("Enter element to add at first: ");
        list.addFirst(sc.nextInt());

        System.out.print("Enter element to add at last: ");
        list.addLast(sc.nextInt());

        System.out.println("Updated Linked List: " + list);

        sc.close();
    }
}