import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for(int i=0; i<cases; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A+B);
        }
    }
}
