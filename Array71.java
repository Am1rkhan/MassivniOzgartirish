package MassivElementlariniOzgartirish;

import java.util.Scanner;

public class Array71 {
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

        reverseArray(massiv);

        System.out.println("Massiv teskari tartibda joylashtirilgan holati:");
        for (int i = 0; i < n; i++) {
            System.out.print(massiv[i] + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
