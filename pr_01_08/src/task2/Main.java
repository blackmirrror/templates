package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(28, "John", "Doe", LocalDate.of(1998, 2, 1), 70));
        humans.add(new Human(19, "Henry", "Manson", LocalDate.of(1999, 12, 11), 70));
        humans.add(new Human(20, "Wensday", "Addams", LocalDate.of(2003, 5, 1), 60));

        Stream<Human> stream = humans.stream();
        stream.forEach(System.out::println);
        System.out.println("----------------------");

        stream = humans.stream();
        stream.forEach((human -> {
            human.setWeight(human.getWeight() - 5);
            System.out.println(human);
        }));
        System.out.println("----------------------");

        stream = humans.stream();
        stream.filter(human -> human.getBirthDate().isAfter(LocalDate.of(1999, 2, 3)))
                .forEach(System.out::println);
        System.out.println("----------------------");

        stream = humans.stream();
        stream.forEach(human -> System.out.print(human.getLastName() + " "));
    }
}
