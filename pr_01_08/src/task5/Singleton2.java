package task5;


//для многопоточных приложений, но не ленивая реализация (как решение: синхронизация или внутренний класс холдер)
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance;
    }
}
