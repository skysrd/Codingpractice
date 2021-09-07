import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        minute-=45;

        if(minute<0) {
            minute+=60;
            hour--;
        }

        if(hour<0) {
            hour+=24;
        }

        System.out.print(hour);
        System.out.println(" ");
        System.out.println(minute);

    }
}
