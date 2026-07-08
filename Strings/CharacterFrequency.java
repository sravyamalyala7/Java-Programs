import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] visited = new boolean[str.length()];

        System.out.println("\nCharacter Frequencies:");

        for (int i = 0; i < str.length(); i++) {

            if (visited[i] || str.charAt(i) == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }

        sc.close();
    }
}