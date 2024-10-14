import java.util.Arrays;

public class FirstExercise {
    public int[] insufficinetGrades(int[] gradesArray) {
        int[] insufficientGradesArr = new int[0];
        int size = 0;
        for (int grade : gradesArray) {
            if (grade < 40) {
                int[] temporaryArray = new int[size + 1];
                for (int i = 0; i < size; i++) {
                    temporaryArray[i] = insufficientGradesArr[i];
                }
                temporaryArray[size] = grade;
                insufficientGradesArr = temporaryArray;
                size++;
            }
        }
        return insufficientGradesArr;
    }

    public double gradesAverage(int[] gradesArray) {
        double sum = 0;
        for (int i = 0; i < gradesArray.length; i++) {
            sum += gradesArray[i];
        }
        double gradesAverage = sum / gradesArray.length;
        return Math.round((gradesAverage * 100.0) / 100.0);
    }

    public int[] roundedGrades(int[] gradesArray) {
        int[] roundedGrades = new int[gradesArray.length];
        int index = 0;
        for (int grade : gradesArray) {
            if (grade >= 38) {
                int nextFiveMultiple = ((grade / 5) + 1) * 5;
                if (nextFiveMultiple - grade < 3) {
                    grade = nextFiveMultiple;
                }
            }
            roundedGrades[index++] = grade;

        }
        return roundedGrades;
    }

    public int maxRoundedGrade(int[] gradesArray) {
        int[] temporaryArray = roundedGrades(gradesArray);
        int max = 0;
        for (int grade : temporaryArray) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FirstExercise firstExercise = new FirstExercise();
        int[] initialSetOfGrades = {29, 37, 38, 84, 67};
        int[] insufficientGradesArr = firstExercise.insufficinetGrades(initialSetOfGrades);
        int[] roundedGradesArr = firstExercise.roundedGrades(initialSetOfGrades);

        //I'm using the
        System.out.println("Exercise 1");
        System.out.println("List of grades: 29, 37, 38, 84, 67 ");
        System.out.println("1. Insufficient score of the grades: " + Arrays.toString(insufficientGradesArr));
        System.out.println("2. Average of the grades: " + firstExercise.gradesAverage(initialSetOfGrades));
        System.out.println("3. Rounded grades: " + Arrays.toString(roundedGradesArr));
        System.out.println("4. Maximum rounded grade: " + firstExercise.maxRoundedGrade(initialSetOfGrades));
    }
}
