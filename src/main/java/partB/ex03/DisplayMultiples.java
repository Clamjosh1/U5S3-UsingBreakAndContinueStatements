package partB.ex03;

import java.util.Scanner;

public class DisplayMultiples {
    public static String displayWithMultiples() {
        String response = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a value:");
        int num = sc.nextInt();

        response += "All of these numbers are a multiple of " + num + ":\n";

        for(int i = 0; i <= 50; i+= num) {
            response += i + " ";
        }

        return response;
    }

    public static void main(String[] args) {
        String output = displayWithMultiples();
        System.out.print(output);
    }
}
