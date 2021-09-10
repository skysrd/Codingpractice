import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();
        // int target = targetorigin;
        int way=1;

        while(target>1) {
            target=target-(way*6);
            way++;
        }
        System.out.println(way);
    }
}
