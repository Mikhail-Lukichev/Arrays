import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Task 1.");
        int[] arr = generateRandomArray();
        int totalExpenditure = 0;
        for (int dayAmount: arr) {
            totalExpenditure = totalExpenditure + dayAmount;
        }
        System.out.println("Total monthly expenditure is " + totalExpenditure);
    }

    public static void task2() {
        System.out.println("Task 2.");
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = -1;
        for (int dayAmount: arr) {
            if (dayAmount > max) {
                max = dayAmount;
            }
            if (dayAmount < min) {
                min = dayAmount;
            }
        }
        System.out.println("Maximum daily expenditure is " + max + ". Minimum daily expenditure is " + min);
    }
    public static void task3() {
        System.out.println("Task 3.");
        int[] arr = generateRandomArray();
        int totalExpenditure = 0;
        double averageExpenditure = 0;
        for (int dayAmount: arr) {
            totalExpenditure = totalExpenditure + dayAmount;
        }
        averageExpenditure = (double) totalExpenditure / arr.length;
        System.out.println("Average daily expenditure is " + averageExpenditure);
    }

    public static void task4() {
        System.out.println("Task 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}