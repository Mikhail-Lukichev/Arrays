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
    public static void task1() {
        System.out.println("Task 1.");
        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 ={1.57, 7.654, 9.986};

        int [] array3 = new int[]{1, 2, 3, 4};
    }

    public static void task2() {
        System.out.println("Task 2.");

        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 ={1.57, 7.654, 9.986};

        int [] array3 = new int[]{1, 2, 3, 4};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void task3() {
        System.out.println("Task 3.");

        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 ={1.57, 7.654, 9.986};

        int [] array3 = new int[]{1, 2, 3, 4};

        for (int i = array1.length-1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length -1; i >=0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length -1; i >=0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        System.out.println("Task 4.");

        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                System.out.print(array1[i]+1);
            } else {
                System.out.print(array1[i]);
            }
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
    }
}