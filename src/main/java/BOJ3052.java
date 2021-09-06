import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rest = new int[42];

        for(int i=0; i<10; i++) {
            int temp = scanner.nextInt();
            rest[temp%42]++;
        }

        int result=0;

        for(int i=0; i<42; i++) {
            if(rest[i]!=0) {
                result++;
            }
        }

        System.out.println(result);
    }
}
