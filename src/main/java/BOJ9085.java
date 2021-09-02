import java.util.Scanner;

public class BOJ9085 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt(); //케이스 수

        for(int i=0; i<cases; i++){
            int nums=scanner.nextInt(); //입력받을 정수의 개수

            int res=0; //피가수

            for(int j=0; j<nums; j++){
                int add = scanner.nextInt(); //가수 입력
                res+=add;
            }
            System.out.println(res);
        }
    }
}
