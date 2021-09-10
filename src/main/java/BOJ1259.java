import java.util.Scanner;

public class BOJ1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.next();
            if(Integer.valueOf(string)==0) {
                break;
            }
            boolean cycle = true;

            for(int i=0; i<string.length()/2; i++) {
                if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
                    System.out.println("no");
                    cycle=false;
                    break;
                }
            }

            if(cycle) {
                System.out.println("yes");
            }

        }
    }
}
