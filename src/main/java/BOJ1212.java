import java.util.Scanner;

public class BOJ1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        String [] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};

        int[] binary0 = {000, 1, 10, 11, 100, 101, 110, 111};

        System.out.print(binary0[Integer.valueOf(string.charAt(0))-48]);

        for(int i=1; i<string.length(); i++) {
            System.out.print(binary[Integer.valueOf(string.charAt(i))-48]);
        }
        System.out.println();
    }
}
