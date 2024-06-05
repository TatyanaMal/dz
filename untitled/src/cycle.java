import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите начало диапазона:");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста, введите конец диапазона:");
        int b = scanner.nextInt();
        System.out.println(a);
        while (a < b) {
            a = a + 1;
            System.out.println(a);
        }
        //Задание с звездочкой
        System.out.println("Задание с звездочкой:");
        System.out.println("Пожалуйста, введите число:");
        int z = scanner.nextInt();
        long f = 1;
        for (int i = 1; i <= z; i++){
            f *= i;
        }
        System.out.println("Факториал числа " + z + " равен " + f);
    }
}
