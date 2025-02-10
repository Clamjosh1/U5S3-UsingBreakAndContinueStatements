package partA.ex01;

import java.util.Scanner;

public class ComputeSum {

    public static String computeSum() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        String sum = computeSum();
        System.out.println(sum);
    }
}
