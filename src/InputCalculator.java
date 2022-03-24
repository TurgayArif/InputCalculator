import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            if(sc.hasNextInt()) {
                number = sc.nextInt();
                sum = sum + number;
                count++;
            } else {
                break;
            }
            sc.nextLine();
        }
        int avg = (int) Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        sc.close();
    }
}
