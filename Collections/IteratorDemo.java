import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter fruit " + i + ": ");
            list.add(sc.nextLine());
        }

        Iterator<String> itr = list.iterator();

        System.out.println("\nFruits:");

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        sc.close();
    }
}