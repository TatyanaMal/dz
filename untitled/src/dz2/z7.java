package dz2;

import java.util.Scanner;

public class z7 {
    /*Задание 7: Возведение в степень.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int base = scanner.nextInt();
        System.out.println("Введите степень числа:");
        int exponent = scanner.nextInt();
        System.out.println(power(base, exponent));
    }
    private static int power(int base, int exponent){
        int result = 1;
        for( int i = 0; i < exponent; i++){
            result *= base;
        }
        return result;
    }
}
