package MassivElementlariniOzgartirish;

import java.util.Scanner;

public class Array72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        System.out.print("k ni kiriting: ");
        int k = scanner.nextInt();
        System.out.print("h ni kiriting: ");
        int h = scanner.nextInt();

        int[] massiv = new int[n];
        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            System.out.print("massiv[" + i + "]: ");
            massiv[i] = scanner.nextInt();
        }

        swapElements(massiv, k, h);

        System.out.println("Massiv elementlarining almashtirilgan holati:");
        for (int i = 0; i < n; i++) {
            System.out.print(massiv[i] + " ");
        }
    }

    private static void swapElements(int[] arr, int k, int h) {
        int temp = arr[k];
        arr[k] = arr[h];
        arr[h] = temp;
    }
}
