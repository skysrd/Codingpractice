import java.util.Scanner;

public class BOJ5361 {
    public static void main(String[] args) {
        double blasterRifleCost=350.34;
        double visualSensorCost=230.90;
        double audioSensorCost=190.55;
        double armCost=125.30;
        double legCost=180.90;

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for(int times = 0; times < cases; times++) {
            int blasterRifleNeed = scanner.nextInt();
            int visualSensorNeed = scanner.nextInt();
            int audioSensorNeed = scanner.nextInt();
            int armNeed = scanner.nextInt();
            int legNeed = scanner.nextInt();

            System.out.print("$");
            double result = (blasterRifleNeed*blasterRifleCost)
                    +(visualSensorNeed*visualSensorCost)
                    +(audioSensorNeed*audioSensorCost)
                    +(armNeed*armCost)
                    +(legNeed*legCost);
            System.out.println(
                    String.format("%.2f", result));
        }
    }
}
