package fundamentals_testing;

public class FibonacciSequence{
    public  int getValue(int sequenceNumber) {
        if (sequenceNumber == 0) {
            return 0;
        }

        if (sequenceNumber == 1) {
            return 1;
        }
        int result = 0;
        int startintPosition = 0;
        int endingPosition = 1;
        for(int i = 1; i<= sequenceNumber; i++){
            result = startintPosition + endingPosition;

            endingPosition = startintPosition;
            startintPosition = result;
        }

        return result;
    }
}
