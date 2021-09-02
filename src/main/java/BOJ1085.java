import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // 왼쪽 끝
        int result = x;

        // 오른쪽 끝
        if(result > width-x) {
            result = width-x;
        }

        // 아래 끝
        if(result > y) {
            result=y;
        }

        //위 끝
        if(result>height-y) {
            result = height-y;
        }

        System.out.println(result);
    }
}
