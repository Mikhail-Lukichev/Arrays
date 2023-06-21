import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
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
    }

    public static void task2() {
        System.out.println("Task 2.");
    }
    public static void task3() {
        System.out.println("Task 3.");
    }

    public static void task4() {
        System.out.println("Task 4.");
    }
}