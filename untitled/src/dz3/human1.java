package dz3;

public class human1 extends Worker {
    public human1(String name, String lastName, String profession) {
        super(name, lastName, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println(name + " " + lastName + " по профессии: " + profession + " " + "- рассчитывает зарплату и сводит дебет с кредетом");
    }

    @Override
    public void goToVocation(int days) {
        super.goToVocation(days);
        System.out.println(name + " " + lastName + " по профессии: " + profession + "," + "уходит в отпуск на " + days + "дней" );
    }
}
