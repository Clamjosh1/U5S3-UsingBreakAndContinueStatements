package partB.ex02;

public class LoopWithContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
