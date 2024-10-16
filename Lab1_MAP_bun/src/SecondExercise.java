public static class SecondExercise {
    int length;
    int[] array;

    public SecondExercise(int length, int[] array) {
        this.length = length;
        this.array = array;
    }

    public int maximumNumber() {
        int maxNumber = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int minimumNumber() {
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int maximumSumWithoutOneNumber() {
        int maxSum = 0;
        int min = minimumNumber();
        for (int i = 0; i < length; i++) {
            if (array[i] != min) {
                maxSum += array[i];
            }
        }
        return maxSum;
    }

    public int minimumSumWithoutOneNumber() {
        int minSum = 0;
        int max = maximumNumber();
        for (int i = 0; i < length; i++) {
            if (array[i] != max) {
                minSum += array[i];
            }
        }
        return minSum;
    }
}

public static void main(String[] args){
    SecondExercise secondExercise = new SecondExercise(5, new int[]{4,8,3,10,17});
    System.out.println("Exercise 2:");
    System.out.println("Array: [4, 8, 3, 10, 17]");
    System.out.println("Maximum number: " + secondExercise.maximumNumber());
    System.out.println("Minimum number: " + secondExercise.minimumNumber());
    System.out.println("Maximum sum: " +secondExercise.maximumSumWithoutOneNumber());
    System.out.println("Mininum sum: " + secondExercise.minimumSumWithoutOneNumber());
}
