import java.util.Scanner;

public class line_struk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число:");
        int b = scanner.nextInt();
        //Сложение двух чисел
        int c = a + b;
        System.out.println("Результат сложения:");
        System.out.println(c);
        //Вычитание двух чисел
        int v = b - a;
        System.out.println("Результат вычитания:");
        System.out.println(v);
        //Уможение двух чисел
        int y = a * b;
        System.out.println("Результат умножения:");
        System.out.println(y);
        //Деление двух чисел
        int d = a / b;
        System.out.println("Результат деления:");
        System.out.println(d);
    }
}
