import java.util.Scanner;

    public class BOJ1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int result=1;

        for (int i=1; i<string.length()-1; i++) {
            if (string.charAt(i) == ' '&&string.charAt(i+1)!=' ') {
                result++;
            }

        }
        System.out.println(result);
    }
}
