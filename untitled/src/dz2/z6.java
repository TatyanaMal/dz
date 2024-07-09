package dz2;

import java.util.Scanner;

public class z6 {
    /*Задание 6: Поиск максимума в массиве*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа!");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " " + "число:");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
