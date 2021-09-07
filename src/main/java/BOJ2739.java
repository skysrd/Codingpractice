import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();

        for(int i=1; i<10; i++) {
            System.out.print(integer);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(integer*i);
        }
    }
}
