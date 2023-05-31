package task6.factory_method;

public class FranceTeaShop extends TeaShop{
    @Override
    public Tea createTea(TeaType type) {
        System.out.println("France " + type + " tea");
        if (type.equals(TeaType.GREEN))
            return new GreenTea();
        return new BlackTea();
    }
}
