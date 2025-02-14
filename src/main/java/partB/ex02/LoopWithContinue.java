package partB.ex02;

public class LoopWithContinue {
    public static String loopWithContinue() {
        String response = "";

        for (int i = 1; i <= 10; i++) {
            if (i >= 5 && i <= 8) {
                continue;
            }
            response += i + "\n";
        }

        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }
}
