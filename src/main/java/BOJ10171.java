import java.util.Scanner;

public class BOJ10171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result=1;
        for(int i=0; i<3; i++) {
            result*=scanner.nextInt();
        }
        String string = String.valueOf(result);


        int[] array = new int[10];

        for(int i=0; i<string.length(); i++) {
            array[string.charAt(i)-48]++;
        }

        for(int i=0; i<10; i++) {
            System.out.println(array[i]);
        }
    }
}
