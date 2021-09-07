import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //int cases = scanner.nextInt();

        int cases = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[cases];

        //initialize
        for(int i=0; i<cases; i++) {
            array[i]=Integer.parseInt(bufferedReader.readLine());
            //array[i]= scanner.nextInt();
        }
        bufferedReader.close();

        //Array sort
        Arrays.sort(array);

        for(int i=0; i<cases; i++) {
            bufferedWriter.write(array[i]+"\n");
            /*bufferedWriter.newLine();*/
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
