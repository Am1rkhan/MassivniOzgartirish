package MassivElementlariniOzgartirish;

import java.util.Scanner;
import java.util.Arrays;

public class Array65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = in.nextInt();

        System.out.print("k ni kiriting: ");
        int k = in.nextInt();

        int[] a = new int[n];
        System.out.println("a massivining elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = in.nextInt();
        }

        System.out.println("a massivi avval: " + Arrays.toString(a));

        increaseAtIndex(a, k);

        System.out.println("a massivi keyin: " + Arrays.toString(a));
    }

    private static void increaseAtIndex(int[] arr, int index) {
        if (index >= 1 && index <= arr.length) {
            arr[index - 1]++;
        } else {
            System.out.println("Index topilmadi!");
        }
    }
}
