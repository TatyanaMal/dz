package dz2;

import java.util.Scanner;

public class z8 {
    /*Задание 8: Минимум и максимум в массиве.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять чисел!");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " " + "число:");
            array[i] = scanner.nextInt();
        }
        int[] array2 = minMax(array);
        System.out.println("Минимальное число = " + array2[0]);
        System.out.println("Максимальное число = " + array2[1]);
    }
    public static int[] minMax(int array[]){
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        return new int[]{min, max};
    }
}
