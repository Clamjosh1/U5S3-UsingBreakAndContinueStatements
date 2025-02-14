package partB.ex01;

import java.util.Scanner;

public class LoopWithBreak {
    public static String loopWithBreak() {
        String response = "";
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        response = "Sum = " + sum;
        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }
}
