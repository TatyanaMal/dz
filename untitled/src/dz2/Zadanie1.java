package dz2;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    /*Задание 1: Угадай число*/
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1 ;
        Scanner scanner = new Scanner(System.in);
        int polzovatel;
        System.out.println("Число загадано, попробуйте угадать :)");

        System.out.println("Введите Ваше предположение:");
        polzovatel = scanner.nextInt();
        boolean pravilno = false;

        while (!pravilno) {
            if (polzovatel < randomNumber) {
                System.out.println("Введенное число меньше загаданного,попробуйте снова:");
                polzovatel = scanner.nextInt();
            } else if (polzovatel > randomNumber) {
                System.out.println("Введенное число больше загаданного,попробуйте снова:");
                polzovatel = scanner.nextInt();
            } else if (polzovatel > 100) {
                System.out.println("Введенное число превышает допустимый предел (100),попробуйте снова:");
                polzovatel = scanner.nextInt();
            } else if (polzovatel < 1) {
                System.out.println("Введенное число меньше допустимого предела (1),попробуйте снова:");
                polzovatel = scanner.nextInt();
            } else {
                System.out.println("Вы угадали!");
                return;
            }
        }
    }

}
