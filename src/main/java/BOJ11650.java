import java.util.Arrays;
import java.util.Scanner;

public class BOJ11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        int[][] array = new int[cases][2];

        for(int i=0; i<cases; i++) {

            array[i][0]=scanner.nextInt();
            array[i][1]=scanner.nextInt();
        }

        Arrays.sort(array, (c1, c2) -> {
            if(c1[0] == c2[0]) {
                return Integer.compare(c1[1],c2[1]);
            }
            else {
                return Integer.compare(c1[0],c2[0]);
            }
        });

        for(int i=0; i<cases; i++) {
            System.out.println(array[i][0]+" "+array[i][1]);
        }
    }
}
