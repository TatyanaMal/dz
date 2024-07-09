package dz2;

import java.util.Scanner;

public class z10 {
    /*Задание 10*: Фибоначчи.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        System.out.println("число Фибоначчи = " + fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n == 1){
            return 1;
        } else if (n == 2) {
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
