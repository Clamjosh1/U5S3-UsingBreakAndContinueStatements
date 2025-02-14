package partC;

public class AlgoChallenge {

    public static Boolean multipleOf(int number){
        if (number >= 0) {
            if (number % 3 == 0 || number % 5 == 0) {
                return true;
            }
        }
        return false;
    }

    public static Boolean checkTemp(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("multipleOf(6) --> " + multipleOf(6));
        System.out.println("multipleOf(14) --> " + multipleOf(14));
        System.out.println("multipleOf(25) --> " + multipleOf(25));

        System.out.println("checkTemp(150, -5) --> " + checkTemp(150, -5));
        System.out.println("checkTemp(-10, 110) --> " + checkTemp(-10, 110));
        System.out.println("checkTemp(3, 50) --> " + checkTemp(3, 50));
    }
}
