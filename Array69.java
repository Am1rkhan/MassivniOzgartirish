package MassivElementlariniOzgartirish;

import java.util.Arrays;
import java.util.Scanner;

public class Array69 {
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

        swapPairs(massiv);

        System.out.println("Natija: " + Arrays.toString(massiv));
    }

    private static void swapPairs(int[] arr) {
        if (arr.length % 2 != 0) {
            System.out.println("Massivda juft sonli elementlar bo'lishi kerak");
            return;
        }

        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
