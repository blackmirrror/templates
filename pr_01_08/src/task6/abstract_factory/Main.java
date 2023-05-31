package task6.abstract_factory;

public class Main {
    public static void main(String[] args) {
        ItalianFactory italianFactory = new ItalianFactory();
        TeaShop teaShop = new TeaShop(italianFactory);
    }
}
