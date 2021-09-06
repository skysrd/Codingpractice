import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for(int i=0; i<cases; i++) {
            String string = scanner.next();

            int temp=0;
            int result=0;

            for(int at=0; at<string.length(); at++) {
                if(string.charAt(at)=='O') {
                    temp++;
                    result+=temp;
                }
                else {
                    temp=0;
                }
            }
            System.out.println(result);
        }
    }
}
