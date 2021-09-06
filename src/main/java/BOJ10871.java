import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        int pole = scanner.nextInt();

        int[] array = new int[cases];

        for(int i=0; i<cases; i++) {
            int temp = scanner.nextInt();
            if(temp<pole) {
                array[i]=temp;
            }
        }
        for(int i=0; i<array.length; i++) {
            if(array[i]!=0) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
