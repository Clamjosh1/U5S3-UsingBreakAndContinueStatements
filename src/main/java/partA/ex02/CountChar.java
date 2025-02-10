package partA.ex02;

public class CountChar {
    public static String countChar() {
        String str = "www.oracle.com";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {
                count++;
            }
        }

        return "Number of w : " + count;
    }

    public static void main(String[] args) {
        String charOutput = countChar();
        System.out.print(charOutput);
    }
}
