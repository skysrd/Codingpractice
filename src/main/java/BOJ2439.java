import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();
        for(int hor=0; hor<lines; hor++){
            int ver=0;
            for(ver=0; ver<(lines-hor-1); ver++){
                System.out.print(" ");
            }
            for(ver=lines-hor-1; ver<lines; ver++){
                System.out.print("*");
            }
/*            for(int ver=0; ver<=hor; ver++){
                System.out.print("*");
            }*/
            System.out.println();
        }
    }
}
