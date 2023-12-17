package MassivElementlariniOzgartirish;

import java.util.Scanner;

public class Array75 {
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

        int engKichikIndex = 0;
        int engKattaIndex = 0;
        for (int i = 1; i < n; i++) {
            if (massiv[i] < massiv[engKichikIndex]) {
                engKichikIndex = i;
            } else if (massiv[i] > massiv[engKattaIndex]) {
                engKattaIndex = i;
            }
        }

        int temp = massiv[engKichikIndex];
        massiv[engKichikIndex] = massiv[engKattaIndex];
        massiv[engKattaIndex] = temp;

        System.out.println("Massiv elementlarining teskari tartibda joylashtirilgan holati:");
        for (int i = 0; i < n; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
