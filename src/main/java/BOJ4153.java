import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int row1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            int row3 = scanner.nextInt();

            if(row1==0&&row2==0&&row3==0) {
                break;
            }

            row1=row1*row1;
            row2=row2*row2;
            row3=row3*row3;

            if(row1+row2==row3||row1+row3==row2||row2+row3==row1) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}
