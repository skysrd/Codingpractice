import java.util.Scanner;
import java.util.Vector;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String stringA = String.valueOf(A);
        String stringB = String.valueOf(B);


        int convA = (Integer.valueOf(stringA.charAt(2)-48)*100)+(Integer.valueOf(stringA.charAt(1)-48)*10)+(Integer.valueOf(stringA.charAt(0)-48));
        int convB = (Integer.valueOf(stringB.charAt(2)-48)*100)+(Integer.valueOf(stringB.charAt(1)-48)*10)+(Integer.valueOf(stringB.charAt(0)-48));

        if(convA>convB) {
            System.out.println(convA);
        }
        else {
            System.out.println(convB);
        }

    }
}
