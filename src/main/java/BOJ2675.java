import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int times = scanner.nextInt();
            String string = scanner.next();

            for (int length = 0; length < string.length(); length++) {
                for (int repeat = 0; repeat < times; repeat++) {
                    System.out.print(string.charAt(length));
                }
            }
            System.out.println();
        }
    }
}
