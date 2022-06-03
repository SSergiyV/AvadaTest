package package_1;
import java.util.Scanner;

public class ArraySort {

    static void sortArray(int[] array) {
        boolean substitute = true;

        while (substitute) {
            substitute = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    substitute = true;
                }
            }
        }
        System.out.println("Масив після сортування:");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int count = i+1;
            System.out.println(count + "-й елемент: " + array[i]);
        }
    }
    static void numEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість елементів в масиві: ");
        int count = 0;

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                count++;
                System.out.println("Введіть " + count + " елемент: ");
                if (scanner.hasNextInt()) {
                    array[i]  = scanner.nextInt();
                }
                else {
                    System.out.println("Ви ввели не ціле число!");
                    numEnter();
                }
            }
            sortArray(array);
        }
        else  {
            System.out.println("Введіть ціле число");
            numEnter();
        }
    }

    public static void main(String[] args) {

        numEnter();
    }
}
