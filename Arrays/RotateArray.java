import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        k = k % n;

        System.out.println("\nArray after right rotation:");

        for (int i = n - k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n - k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}