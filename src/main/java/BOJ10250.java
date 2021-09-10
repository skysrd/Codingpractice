import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for(int i=0; i<cases; i++) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            int customer = scanner.nextInt();

            int tarw=1;
            int tarh=0;
            for(int j=0; j<customer; j++) {
                tarh++;
                if(tarh>height) {
                    tarw++;
                    tarh-=height;
                }
            }
            System.out.print(tarh);
            if(tarw<10) {
                System.out.println("0"+tarw);
            }
            else {
                System.out.println(tarw);
            }
        }
    }
}
