package Zakharova;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size:");
        int n = scanner.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                System.out.println(mas[i]);
            }
            System.out.println();
        }
    }
}



