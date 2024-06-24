import java.util.Scanner;

public class z9 {
    /*Задание 9: Число в массиве*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа!");
        int[] array = new int[5];
        System.out.println("Введите число: ");
        int target = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " " + "число:");
            array[i] = scanner.nextInt();
        }
        System.out.println(contains(array,target));
    }
    public static boolean contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                return true;
            }
        }
        return false;
    }
}

