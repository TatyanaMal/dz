package dz7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Pavel", 22,"New York"));
        persons.add(new Person("Igor",4,"Moscow"));
        persons.add(new Person("Ivan",27,"Omsk"));
        persons.add(new Person("Maxim",25,"New York"));
        persons.add(new Person("Dmitry",51,"New York"));
        persons.add(new Person("Marina",15,"Yekaterinburg"));
        persons.add(new Person("Eva",10,"New York"));

        List<String> result = persons.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getName())
                .sorted()
                .collect(Collectors.toList());
        long count = persons.stream()
                 .filter(person -> person.getAge() > 30)
                 .count();
        Optional<Object> old = persons.stream()
                 .max(Comparator.comparingInt(Person::getAge))
                 .map(person -> person.getName());
        double sr = persons.stream()
                 .filter(person -> "New York".equals(person.getCity()))
                 .mapToInt(Person::getAge)
                 .average()
                 .orElse(0);

        System.out.println("Люди старше 18 лет: " + result);
        System.out.println("Количество людей старше 30 лет: " + count);
        System.out.println("Самый старший: " + old);
        System.out.println("Средний возраст людей, проживающих в New York: " + sr);


    }
}
