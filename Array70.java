package MassivElementlariniOzgartirish;

import java.util.Scanner;

public class Array70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();

        int[] massiv = new int[n];
        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            System.out.print("massiv[" + i + "]: ");
            massiv[i] = scanner.nextInt();
        }

        swapFirstAndSecondHalf(massiv);

        System.out.println("Massivning birinchi yarmi va ikkinchi yarmi almashtirilgan holati:");
        for (int i = 0; i < n; i++) {
            System.out.print(massiv[i] + " ");
        }
    }

    private static void swapFirstAndSecondHalf(int[] arr) {
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[mid + i];
            arr[mid + i] = temp;
        }
    }
}
