import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        String[] array = new String[cases+1];
        array[cases+1]="0";
        for(int i=0; i<cases; i++) {
            array[i]=scanner.next();
        }

        Arrays.sort(array);

        for(int i=1; i<=array.length; i++) {
            if(array[i]==array[i-1]);
            else {
                System.out.println(array[i]);
            }
        }
    }
}
