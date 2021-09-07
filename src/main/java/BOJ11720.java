import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        String string = scanner.next();

        int result=0;

        for(int i=0; i<cases; i++) {
            result+=Integer.valueOf(string.charAt(i))-48;
        }

        System.out.println(result);
    }
}
