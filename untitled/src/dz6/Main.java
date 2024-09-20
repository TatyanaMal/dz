package dz6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создать ArrayList и добавьте в него 10 имен (строк)
        ArrayList<String> names = new ArrayList<>();
        names.add("Петр");
        names.add("Иван");
        names.add("Родион");
        names.add("Мария");
        names.add("Оксана");
        names.add("Светлана");
        names.add("Анна");
        names.add("Евгений");
        names.add("Степан");
        names.add("Татьяна");
        System.out.println("Изначальный список имен: " + names);
        //Вставить новое имя на пятый индекс
        names.add(5,"Константин");
        System.out.println("Новое имя на 5 индексе: " + names);
        //Удалить пятое имя в списке
        names.remove(4);
        System.out.println("После удаления 5 элемента: " + names);
        //Проверить, содержит ли список имя "Иван" и вывести результат на экран
        boolean ivan = names.contains("Иван");
        System.out.println("Список содержит имя 'Иван'" + " = " + ivan);
        //Вывести на экран элемент под 9 индексом
        if(names.size() > 9){
            System.out.println("Элемент под 9 индексом: " + names.get(9));
        }
        else {
            System.out.println("Элемента под 9 индексом нет");
        }
        //Заменить четвертый элемент на имя "Тарас"
        names.set(3,"Тарас");
        System.out.println("После замены 4 элемента: " + names);
        //Создать итератор на основе списка и обойти весь список с помощью него. При обходе выводить имена.
        Iterator<String> iterator = names.iterator();
        System.out.println("Список с использованием итератора: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Получить подсписок с 5 по 9 элемент
        List<String> sublist = names.subList(4, 9);
        System.out.println("Подсписок с 5 по 9 элемент: " + sublist);
        //Создать второй список имен и добавить все имена из одного списка в другой
        ArrayList<String> newlist = new ArrayList<>(names);
        System.out.println("Второй список имен: " + newlist);
        //Потом удалить все имена, которые содержатся в другом списке
        newlist.removeAll(names);
        System.out.println("Список после удаления всех имен содержащихся в другом списке: ");
        //Создать LinkedList и добавьте в него 10 городов (строк)
        LinkedList<String> city = new LinkedList<>();
        city.add("Москва");
        city.add("Казань");
        city.add("Норильск");
        city.add("Дмитров");
        city.add("Дубна");
        city.add("Омск");
        city.add("Ялта");
        city.add("Чебоксары");
        city.add("Королев");
        city.add("Истра");
        System.out.println("Изначальный список городов: " + city);

        //Добавить в начало 5 городов и вывести города в консоль
        city.addFirst("Астрахань");
        city.addFirst("Якутск");
        city.addFirst("Краснодар");
        city.addFirst("Воронеж");
        city.addFirst("Самара");
        System.out.println("С добавлением городов в начало: " + city);
        //Добавить в конец 5 городов и вывести города в консоль
        city.addLast("Ярославль");
        city.addLast("Ижевск");
        city.addLast("Пермь");
        city.addLast("Вологда");
        city.addLast("Александров");
        System.out.println("С добавлением городов в конец: " + city);
        //Удалить 3 города в начале и вывести города в консоль
        city.removeFirst();
        city.removeFirst();
        city.removeFirst();
        System.out.println("С удаленными в начале городами: " + city);
        //Удалить 4 города в конце и вывести города в консоль
        city.removeLast();
        city.removeLast();
        city.removeLast();
        city.removeLast();
        System.out.println("С удаленными с конца городами: " + city);
    }
}
