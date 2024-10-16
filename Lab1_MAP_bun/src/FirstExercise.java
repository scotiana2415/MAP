import java.util.Arrays;

public class FirstExercise {
    // Method to find grades that are below the passing threshold of 40
    public int[] insufficinetGrades(int[] gradesArray) {
        int[] insufficientGradesArr = new int[0]; // Array to hold grades below 40
        int size = 0; // Size of the insufficientGradesArr array

        // Iterate through each grade in the array
        for (int i = 0; i < gradesArray.length; i++) {
            int grade = gradesArray[i];
            // Check if the grade is less than 40
            if (grade < 40) {
                // Create a temporary array to increase the size by 1
                int[] temporaryArray = new int[size + 1];
                // Copy existing insufficient grades into the new temporary array
                for (int j = 0; j < size; j++) {
                    temporaryArray[j] = insufficientGradesArr[j];
                }
                // Add the new insufficient grade to the array
                temporaryArray[size] = grade;
                // Update insufficientGradesArr to the new array
                insufficientGradesArr = temporaryArray;
                size++; // Increase the size for the next grade
            }
        }
        return insufficientGradesArr; // Return the array of insufficient grades
    }

    // Method to calculate the average of the grades in the array
    public double gradesAverage(int[] gradesArray) {
        double sum = 0; // Variable to store the sum of all grades

        // Loop through the grades and add them to the sum
        for (int i = 0; i < gradesArray.length; i++) {
            sum += gradesArray[i];
        }
        // Calculate the average by dividing the sum by the number of grades
        double gradesAverage = sum / gradesArray.length;
        // Round the result to two decimal places
        return Math.round((gradesAverage * 100.0) / 100.0);
    }

    // Method to round grades according to specific rules
    public int[] roundedGrades(int[] gradesArray) {
        int[] roundedGrades = new int[gradesArray.length]; // Array to hold rounded grades

        // Loop through each grade in the array
        for (int i = 0; i < gradesArray.length; i++) {
            int grade = gradesArray[i];
            // If the grade is 38 or above, check if it needs rounding
            if (grade >= 38) {
                int nextFiveMultiple = ((grade / 5) + 1) * 5; // Find the next multiple of 5
                // If the difference between the next multiple of 5 and the grade is less than 3
                if (nextFiveMultiple - grade < 3) {
                    grade = nextFiveMultiple; // Round the grade up to the next multiple of 5
                }
            }
            roundedGrades[i] = grade; // Store the (possibly rounded) grade in the array
        }
        return roundedGrades; // Return the array of rounded grades
    }

    // Method to find the maximum grade after rounding
    public int maxRoundedGrade(int[] gradesArray) {
        int[] temporaryArray = roundedGrades(gradesArray); // Get the array of rounded grades
        int max = 0; // Variable to store the maximum grade

        // Loop through the rounded grades to find the highest one
        for (int i = 0; i < temporaryArray.length; i++) {
            int grade = temporaryArray[i];
            // Update max if the current grade is higher
            if (grade > max) {
                max = grade;
            }
        }
        return max; // Return the maximum rounded grade
    }

    public static void main(String[] args) {
        FirstExercise firstExercise = new FirstExercise();
        int[] initialSetOfGrades = {29, 37, 38, 84, 67}; // Array of initial grades
        int[] insufficientGradesArr = firstExercise.insufficinetGrades(initialSetOfGrades); // Get insufficient grades
        int[] roundedGradesArr = firstExercise.roundedGrades(initialSetOfGrades); // Get rounded grades

        // Output the results
        System.out.println("Exercise 1:");
        System.out.println("List of grades: 29, 37, 38, 84, 67 ");
        System.out.println("1. Insufficient score of the grades: " + Arrays.toString(insufficientGradesArr));
        System.out.println("2. Average of the grades: " + firstExercise.gradesAverage(initialSetOfGrades));
        System.out.println("3. Rounded grades: " + Arrays.toString(roundedGradesArr));
        System.out.println("4. Maximum rounded grade: " + firstExercise.maxRoundedGrade(initialSetOfGrades));
    }
}
