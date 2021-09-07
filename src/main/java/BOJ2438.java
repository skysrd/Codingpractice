import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();
        for(int hor=0; hor<lines; hor++){
            for(int ver=0; ver<=hor; ver++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
