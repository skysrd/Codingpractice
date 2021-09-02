import java.util.Scanner;

public class BOJ2445{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();

        int linemax = lines*2-1;

        for(int hor=1; hor<=linemax; hor++){

            int gap = Math.abs(lines-hor);

            int ver=0;
            for(; ver<lines-gap; ver++) {
                System.out.print("*");
            }
            for(; ver<lines+gap; ver++) {
                System.out.print(" ");
            }
            for(; ver<2*lines; ver++) {
                System.out.print("*");
            }

/*            for(int ver=1; ver<=linemax; ver++) {
                if(Math.abs(lines-ver)<gap) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }*/


            System.out.println();
        }
    }
}
