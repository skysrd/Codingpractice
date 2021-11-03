import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int origin = scanner.nextInt();

        int bongji=0;

        while(origin!=0) {
            if(origin%5==0) {
                bongji++;
                origin-=5;
            }
            else if(origin%3==0) {
                bongji++;
                origin-=3;
            }
            else {
                bongji = -1;
                break;
            }
        }

        System.out.println(bongji);
    }
}
