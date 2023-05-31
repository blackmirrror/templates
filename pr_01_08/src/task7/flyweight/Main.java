package task7.flyweight;

// Легковес — это структурный паттерн проектирования,
// который позволяет вместить бóльшее количество объектов
// в отведённую оперативную память. Легковес экономит память,
// разделяя общее состояние объектов между собой,
// вместо хранения одинаковых данных в каждом объекте.

public class Main {
    public static void main(String[] args) {
        StarFactory factory = new StarFactory();
        System.out.println(factory.createStar(SpectralType.F).hashCode());
        System.out.println(factory.createStar(SpectralType.F).hashCode());
        System.out.println(factory.createStar(SpectralType.F).hashCode());
        System.out.println(factory.createStar(SpectralType.G).hashCode());
        System.out.println(factory.createStar(SpectralType.G).hashCode());
    }
}
