import java.util.Scanner;

public class BOJ1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xmax = scanner.nextInt();
        int ymax = scanner.nextInt();

        char[][] board = new char[xmax][ymax];

        int fix1 = 0;
        int fix2 = 0;
        int min=50*50;
        for (int x = 0; x < xmax; x++) {
            String temp = scanner.next();
            for (int y = 0; y < ymax; y++) {
                board[x][y] = temp.charAt(y);
            }
        }
        for (int x = 0; x <= xmax - 8; x++) {
            for (int y = 0; y <= ymax - 8; y++) {
                for (int i = x; i < x+8; i++) {
                    for (int j = y; j < y+8; j++) {
                        //합이 짝수인 경우 W
                        if ((i + j) % 2 == 0) {
                            if (board[i][j] == 'B') {
                                fix1++;
                            }
                        }
                        if ((i +j) % 2 == 1) {
                            if (board[i][j] == 'W') {
                                fix1++;
                            }
                        }
                        if ((i + j) % 2 == 0) {
                            if (board[i][j] == 'W') {
                                fix2++;
                            }
                        }
                        if ((i + j) % 2 == 1) {
                            if (board[i][j] == 'B') {
                                fix2++;
                            }
                        }
                    }
                }
                if(min>fix1) {
                    min=fix1;
                }
                if(min>fix2) {
                    min=fix2;
                }
                fix1=0;
                fix2=0;
            }

        }
        System.out.println(min);
    }
}
