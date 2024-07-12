package dz3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[]{
                new human1("Иван", "Иванов", "Бухгалтер"),
                new human2("Диана", "Василькова", "Учитель"),
                new human3("Максим", "Румынский", "Разработчик"),
                new human4("Алексей", "Сафонов", "Врач-терапевт"),
        };


        for (Worker worker : workers) {
            worker.goToWork();
            worker.goToVocation(14);
            System.out.println();
        }
    }
}
