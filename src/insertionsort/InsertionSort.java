/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Random;

/**
 *
 * @author Borgar Bordoy
 */
public class InsertionSort {

    private static int[] randomArray;

    private void sort(int arr[]) {
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long endTime = System.nanoTime();
        System.out.println("Took: " + (endTime - startTime) + " ns");
    }

    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int randomFill() {
        Random r = new Random();
        int randomNum = r.nextInt();
        return randomNum;
    }

    public static int[] list() {
        randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomFill();
        }
        return randomArray;
    }

    public static void main(String[] args) {

        int[] A = {5, 6, 11, 12, 13, 14, 16, 20, 33, 50};
        int[] B = {50, 33, 20, 16, 14, 13, 12, 11, 6, 5};

        InsertionSort is = new InsertionSort();

        // Random Case
        System.out.println("Random Case: ");
        is.sort(is.list());
        is.printArray(is.list());

        // Best Case
        System.out.println("Best Case: ");
        is.sort(A);
        is.printArray(A);

        // Worst Case
        System.out.println("Worst Case: ");
        is.sort(B);
        is.printArray(B);
    }

}
