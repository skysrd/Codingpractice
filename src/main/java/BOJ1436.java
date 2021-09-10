import java.util.Scanner;

public class BOJ1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int target=0;

        int temp = 0;
        while(true) {
            temp++;
            if(String.valueOf(temp).contains("666")) {
                target++;
                if (target==num) {
                    System.out.println(temp);
                    break;
                }
            }
        }
    }
}
