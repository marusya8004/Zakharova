package Zakharova;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String word1 = "Вячеслав";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести новое имя: ");
        String word2 = scanner.nextLine();
        if (word1.equals(word2)) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
