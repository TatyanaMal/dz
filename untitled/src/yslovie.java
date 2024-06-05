import java.util.Scanner;

public class yslovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число:");
        int b = scanner.nextInt();
        //Сравнение двух чисел
        if(a > b){
            System.out.println("Первое число больше второго");
        } else if(b > a) {
            System.out.println("Второе число больше первого");
        } else{
            System.out.println("Оба числа равны");
        }
        //Улучшение программы из класса line_struk

        //Сложение двух чисел
        int c = a + b;
        if(a < 0){
            System.out.println("Я не хочу работать с отрицательными числами");
        } else if(b < 0){
            System.out.println("Я не хочу работать с отрицательными числами");
        }else{
            System.out.println("Результат сложения:");
            System.out.println(c);
        }
        //Вычитание двух чисел
        int v = b - a;
        if(a > b){
            v = a - b;
            System.out.println("Результат вычитания:");
            System.out.println(v);
        }else{
            System.out.println("Результат вычитания:");
            System.out.println(v);
        }

        //Уможение двух чисел
        int y = a * b;
        if(a < 0){
            System.out.println("Я не хочу работать с отрицательными числами");
        } else if(b < 0){
            System.out.println("Я не хочу работать с отрицательными числами");
        }else {
            System.out.println("Результат умножения:");
            System.out.println(y);
        }
        //Деление двух чисел
        int d = b / a;
        if(a > b){
            d = a / b;
            System.out.println("Результат деления:");
            System.out.println(d);
        } else{
            System.out.println("Результат деления:");
            System.out.println(d);
        }
    }
}
