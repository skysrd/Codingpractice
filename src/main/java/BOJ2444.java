import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();

        int linemax = lines*2-1;

        for(int hor=1; hor<=linemax; hor++){
            int ver=0;
            int gap = Math.abs(lines-hor);
            for(;ver<gap; ver++){
                System.out.print(" ");
            }
            for(;ver<linemax-gap;ver++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
