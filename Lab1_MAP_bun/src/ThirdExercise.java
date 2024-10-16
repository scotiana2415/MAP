import java.util.Arrays;

public class ThirdExercise {
    public int[] add(int[] addToEndOne, int[] addToEndTwo) {
        int aux = 0;
        int[] result = new int[addToEndOne.length];
        for (int i = addToEndOne.length - 1; i >= 0; i--) {
            int sum = addToEndOne[i] + addToEndTwo[i] + aux;
            result[i] = sum % 10;
            aux = sum / 10;
        }
        if (aux > 0) {
            int[] extendedResult = new int[addToEndOne.length + 1];
            for (int i = 0; i < result.length; i++) {
                extendedResult[i + 1] = result[i];
            }
            extendedResult[0] = aux;
            return extendedResult;
        }
        return result;
    }

    public int[] subtract(int[] minuend, int[] subtrahend) {
        int borrow = 0;
        int[] result = new int[minuend.length];
        for (int i = minuend.length - 1; i >= 0; i--) {
            int diff = minuend[i] - subtrahend[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else
                borrow = 0;
            result[i] = diff;
        }
        return result;
    }

}