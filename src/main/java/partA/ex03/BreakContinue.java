package partA.ex03;

public class BreakContinue {

    public static String breakContinue() {
        String response = "";

        for( int i = 0 ; i < 10 ; i++ ) {

            if( i % 2 == 0) {

            }

            response += ("The number is " + i );

            if( i == 7 ) {

            }

        }

        return response;
    }
    public static void main( String [] args ) {
        String outputBreak = breakContinue();
        System.out.println(outputBreak);


    }
}
