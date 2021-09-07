import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        int[] place = new int[26];
        Arrays.fill(place,-1);

        for(int i=0; i<string.length(); i++) {
            int temp = Integer.valueOf(string.charAt(i))-97;
            if(place[temp]==-1) {
                place[temp]=i;
            }
        }
        for(int i=0; i<place.length; i++) {
            System.out.print(place[i]+" ");
        }

        System.out.println();

    }
}
