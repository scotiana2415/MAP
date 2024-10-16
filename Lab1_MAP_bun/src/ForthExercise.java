public class forthExercise {
    public int cheapestKeyboard(int[] objects) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] < minCost) {
                minCost = objects[i];
            }
        }
        return minCost;
    }

    public int mostExpensiveObjects(int[] objects) {
        int maxCost = Integer.MIN_VALUE;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] > maxCost) {
                maxCost = objects[i];
            }
        }
        return maxCost;
    }

    public int mostExpensiveUSBWithinBudget(int[] objects, int budget) {
        int maxCost = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] > maxCost && objects[i] < budget) {
                maxCost = objects[i];
            }
        }
        return maxCost;
    }

    public int withinBudgetObjects(int[] keyboards, int[] USBs, int budget) {
        int maxCost = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < USBs.length; j++) {
                int totalCost = keyboards[i] + USBs[j];
                if (maxCost < totalCost && totalCost < budget) {
                    maxCost = totalCost;
                }
            }
        }
        return maxCost;
    }

    public static void main(String[] args) {
        forthExercise forthExercise = new forthExercise();
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] keyboardsTwo = {15, 20, 10, 35};
        int[] usbs = {20, 15, 40, 15};
        int[] usbsTwo = {15, 45, 20};
        int[] keyboardsThree = {40, 50, 60};
        int[] usbsThree = {8, 12};
        int[] keyboardsFour = {60};
        int[] keyboardsFive = {40, 60};

        System.out.println("Exercise 4: ");
        System.out.println("Keyboards: [40, 35, 70, 15, 45] -> Cheapest keyboard: " + forthExercise.cheapestKeyboard(keyboards));
        System.out.println("Keyboards: [15, 20, 10, 35] -> Most expensive keyboard: " + forthExercise.mostExpensiveObjects(keyboardsTwo));
        System.out.println("USBs: [20, 15, 40, 15] -> Most expensive USB: " + forthExercise.mostExpensiveObjects(usbs));
        System.out.println("USBs: [15, 45, 20], Budget: 30 -> Most expensive within budget: " + forthExercise.mostExpensiveUSBWithinBudget(usbsTwo, 30));
        System.out.println("Keyboards: [40, 50, 60], USBs: [8, 12], Budget: 60 -> Markus spends: " + forthExercise.withinBudgetObjects(keyboardsThree, usbsThree, 60));
        System.out.println("Keyboards: [60], USBs: [8, 12], Budget: 60 -> Markus spends: " + forthExercise.withinBudgetObjects(keyboardsFour, usbsThree, 60));
        System.out.println("Keyboards: [40, 60], USBs: [8, 12], Budget: 60 -> Markus spends: " + forthExercise.withinBudgetObjects(keyboardsFive, usbsThree, 60));

    }
}
