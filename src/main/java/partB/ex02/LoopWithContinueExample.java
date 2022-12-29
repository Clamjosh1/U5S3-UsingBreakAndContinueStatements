package partB.ex02;

public class LoopWithContinueExample {
    public static String loopWithContinue() {
        String response = "";

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            response += (i + "\t");
        }

        return response;
    }
    public static void main(String[] args) {
        String outputLoop = loopWithContinue();
        System.out.println(outputLoop);
    }
}
