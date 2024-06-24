import java.util.Scanner;

public class z4 {
    /*Задание 4: Проверка на простое число.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num;
        num = scanner.nextInt();
        System.out.println(isPrime(num));
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i * i <= num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
