package task5;

public class Singleton3 {

    private static class Singleton3Holder {
        private static final Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Singleton3Holder.instance;
    }
}
