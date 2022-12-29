package partB.ex01;

import java.util.Scanner;

public class LoopWithBreakExample {
    public static String loopWithBreak() {
        String response = "";

        Scanner in = new Scanner(System.in);
        int numInputs = 10;
        int input = 0;
        int sum = 0;
        int stopLoop = 999;
        response += ("Enter 10 numbers");
        for (int i = 0; i < numInputs; i++) {
            input = in.nextInt();
            if (input == stopLoop) {
                break;
            } else {
                sum += input;
            }
        }
        response += ("The sum of the numbers: " + sum);

        return response;
    }
    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.println(loopOutput);
    }

}




