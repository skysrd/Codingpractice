import java.util.Arrays;
import java.util.Scanner;

public class BOJ1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        String[] array = new String[cases];

        for(int i=0; i<array.length; i++) {
            array[i]=scanner.next();
        }

        Arrays.sort(array);

        int a=0;

        for(int i=0; i<=array.length; i++) {
            System.out.println(array[i]);
        }
    }
}