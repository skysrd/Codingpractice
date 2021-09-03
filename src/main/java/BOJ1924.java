import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int[] monthday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        int totalday = 0;
        for(int i=0; i<month; i++) {
            totalday+=monthday[i];
        }

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.println(days[(totalday+day)%7]);
    }
}
