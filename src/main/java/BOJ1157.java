import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        //A=65

        int[] alphabet = new int[26];
        int max=0;
        int maxflag=0;
        int multiflag=0;
        for(int i=0; i<string.length(); i++) {
            if (Integer.valueOf(string.charAt(i)) > 96) {
                alphabet[Integer.valueOf(string.charAt(i)) - 97]++;

                if(alphabet[Integer.valueOf(string.charAt(i))-97]>max) {
                    max=alphabet[Integer.valueOf(string.charAt(i))-97];
                    maxflag=Integer.valueOf((string.charAt(i))-97);
                    multiflag=0;
                }
                else if(alphabet[Integer.valueOf(string.charAt(i))-97]==max) {
                    multiflag=1;
                }
            } else {
                alphabet[Integer.valueOf(string.charAt(i)) - 65]++;

                if(alphabet[Integer.valueOf(string.charAt(i))-65]>max) {
                    max=alphabet[Integer.valueOf(string.charAt(i))-65];
                    maxflag=Integer.valueOf((string.charAt(i))-65);
                    multiflag=0;
                }
                else if(alphabet[Integer.valueOf(string.charAt(i))-65]==max) {
                    multiflag=1;
                }
            }
        }

        if(multiflag==1) {
            System.out.println('?');
        }
        else {
            System.out.println((char)(maxflag+65));
        }
    }
}
