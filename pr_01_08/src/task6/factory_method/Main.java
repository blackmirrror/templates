package task6.factory_method;

public class Main {
    public static void main(String[] args) {
        FranceTeaShop shop = new FranceTeaShop();
        shop.createTea(TeaType.GREEN);
        shop.orderTea(TeaType.GREEN);
    }
}
