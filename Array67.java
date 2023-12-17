package MassivElementlariniOzgartirish;

import java.util.Arrays;
import java.util.Scanner;

public class Array67 {
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

        boolean toqMavjud = increaseFirstEvenToLastOdd(massiv);

        System.out.println("Natija: " + Arrays.toString(massiv));

        if (toqMavjud) {
            System.out.println("Har bir juft sonni birinchi uchragan toq songa o'zgartirdi.");
        } else {
            System.out.println("Toq sonlar mavjud emas.");
        }
    }

    private static boolean increaseFirstEvenToLastOdd(int[] arr) {
        boolean toqMavjud = false;
        int birinchiJuftIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                birinchiJuftIndex = i;
                break;
            }
        }

        if (birinchiJuftIndex != -1) {
            for (int i = birinchiJuftIndex + 1; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i]++;
                    toqMavjud = true;
                    break;
                }
            }
        }

        return toqMavjud;
    }
}

