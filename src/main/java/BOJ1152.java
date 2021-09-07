import java.util.Scanner;

    public class BOJ1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String[] result = string.trim().split(" ");

        if (string.isBlank()) {
            System.out.println(0);
        }
        else {
            System.out.println(result.length);
        }
    }
}
