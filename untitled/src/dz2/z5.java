package dz2;

import java.util.Scanner;

public class z5 {
    /*Задание 5: Сумма элементов массива.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целые числа!");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " " + "число:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Сумма элементов = " + sumArray(array));
    }
    private static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
