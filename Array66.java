package MassivElementlariniOzgartirish;

import java.util.Arrays;
import java.util.Scanner;

public class Array66 {
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

        boolean juftMavjud = increaseFirstEven(massiv);

        System.out.println("Natija: " + Arrays.toString(massiv));

        if (juftMavjud) {
            System.out.println("Juft sonlar birinchi uchragan juft songa o'zgardi.");
        } else {
            System.out.println("Juft sonlar mavjud emas.");
        }
    }

    private static boolean increaseFirstEven(int[] arr) {
        boolean juftMavjud = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
                juftMavjud = true;
                break;
            }
        }
        return juftMavjud;
    }
}
