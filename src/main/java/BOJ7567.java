import java.util.Scanner;

public class BOJ7567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        int height=10;

        for(int i=1; i<string.length(); i++) {
            char plate1 = string.charAt(i-1);
            char plate2 = string.charAt(i);

            if(plate1!=plate2) {
                height+=10;
            }
            else {
                height+=5;
            }
        }
        System.out.println(height);
    }
}
