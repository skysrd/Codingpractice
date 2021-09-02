import java.util.Scanner;

public class BOJ2522 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();

        int linemax = lines*2-1;

        for(int hor=1; hor<=linemax; hor++){

            for(int ver=1; ver<=Math.abs(lines-hor); ver++) {
                System.out.print(" ");
            }

            for(int ver=Math.abs(lines-hor); ver<lines; ver++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
