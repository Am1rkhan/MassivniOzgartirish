package MassivElementlariniOzgartirish;

import java.util.Arrays;
import java.util.Scanner;

public class Array68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = in.nextInt();

        int[] massiv = new int[n];
        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            System.out.print("massiv[" + i + "]: ");
            massiv[i] = in.nextInt();
        }

        swapSmallestAndLargest(massiv);

        System.out.println("Natija: " + Arrays.toString(massiv));
    }

    private static void swapSmallestAndLargest(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int smallestIndex = 0;
        int largestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            } else if (arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }

        int temp = arr[smallestIndex];
        arr[smallestIndex] = arr[largestIndex];
        arr[largestIndex] = temp;
    }
}
