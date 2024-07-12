package dz3;

public class human3 extends Worker{
    public human3(String name, String lastName, String profession) {
        super(name, lastName, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println(name + " " + lastName + " по профессии: " + profession + " " + "- разрабатывает приложения");
    }

    @Override
    public void goToVocation(int days) {
        super.goToVocation(days);
        System.out.println(name + " " + lastName + " по профессии: " + profession + "," + "уходит в отпуск на " + days + "дней" );
    }
}
