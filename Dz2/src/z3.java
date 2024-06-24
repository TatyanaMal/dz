import java.util.Scanner;

public class z3 {
    /*Задание 3: Максимум из трёх чисел*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целые числа!");
        System.out.println("Введите первое число:");
        int one = scanner.nextInt();
        System.out.println("Введите второе число:");
        int two = scanner.nextInt();
        System.out.println("Введите третье число:");
        int three = scanner.nextInt();

        int max = maxOfThree(one, two, three);
        System.out.println("Наибольшее:" + max);
    }
    private static int maxOfThree(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
}

