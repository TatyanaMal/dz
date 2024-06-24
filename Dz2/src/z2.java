import java.util.Scanner;

public class z2 {
    //Задание 2: Массив положительных чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
           System.out.println((i + 1) + "число" + ":");
           array[i] = scanner.nextInt();
        }
        System.out.println("Положительные:");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}
