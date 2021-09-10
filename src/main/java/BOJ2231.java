import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();

        boolean flag=false;

        for(int i=0; i<target; i++) {
            String string = Integer.toString(i);
            int temp = i;
            for(int j=0; j<string.length(); j++) {
                temp+=Character.getNumericValue(string.charAt(j));
            }
            if(temp==target) {
                System.out.println(i);
                flag=true;
                break;
            }
        }

        if(flag==false) {
            System.out.println(0);
        }
    }
}
