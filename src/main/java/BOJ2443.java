import java.util.Scanner;

public class BOJ2443 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lines = 0;

        lines = scanner.nextInt();

        int vertmax = lines*2-1;

        for(int hor=0; hor<lines; hor++){
            for(int blanks=0; blanks<hor; blanks++){
                System.out.print(" ");
            }
            for(int ver=0; ver<vertmax; ver++){
                System.out.print("*");
            }
            vertmax-=2;
            System.out.println();
        }
    }
}
