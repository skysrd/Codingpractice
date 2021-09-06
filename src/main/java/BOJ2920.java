import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ascending=1;
        int descending=1;

        int ascstart=1;
        int descstart=8;

        for(int i=0; i<8; i++) {
            int temp = scanner.nextInt();
            if(temp!=ascstart) {
                ascending=0;
            }
            if(temp!=descstart) {
                descending=0;
            }
            descstart--;
            ascstart++;
        }
        if(ascending==1) {
            System.out.println("ascending");
        }
        else if (descending==1) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}
