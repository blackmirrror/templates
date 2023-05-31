package task5;


public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton1Copy = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton2Copy = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton3Copy = Singleton3.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton4 singleton4Copy = Singleton4.getInstance();

        System.out.print("\nSingleton1 hashCodes: ");
        System.out.print(singleton1.hashCode() + " ");
        System.out.println(singleton1Copy.hashCode());

        System.out.print("\nSingleton2 hashCodes: ");
        System.out.print(singleton2.hashCode() + " ");
        System.out.println(singleton2Copy.hashCode());

        System.out.print("\nSingleton3 hashCodes: ");
        System.out.print(singleton3.hashCode() + " ");
        System.out.print(singleton3Copy.hashCode());

        System.out.print("\nSingleton4 hashCodes: ");
        System.out.print(singleton4.hashCode() + " ");
        System.out.print(singleton4Copy.hashCode());
    }
}
