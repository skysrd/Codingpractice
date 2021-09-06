import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        int max=-1000000;
        int min=1000000;

        for(int i=0; i<cases; i++) {
            int temp = scanner.nextInt();

            if(temp>max) {
                max=temp;
            }

            if(temp<min) {
                min=temp;
            }
        }

        System.out.println(min+" "+max);
    }
}
