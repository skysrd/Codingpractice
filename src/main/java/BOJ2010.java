import java.util.Scanner;

public class BOJ2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //케이스 수
        int cases = scanner.nextInt();

        int result=0;
        // 반복
        for(int tabs=0; tabs<cases-1 ; tabs++) {
            //가수
            result+=scanner.nextInt()-1;

        }

        // 마지막 수는 단순 가산
        result+= scanner.nextInt();

        System.out.println(result);
    }
}
