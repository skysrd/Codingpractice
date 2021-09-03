import java.util.Scanner;

public class BOJ2747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fib0=0, fib1=1;

        int cases = scanner.nextInt();

        int next = 0;

        for(int i=0; i<cases; i++) {
            next=fib0+fib1;
            fib0=fib1;
            fib1=next;
        }

        System.out.print(fib0);
    }
}
