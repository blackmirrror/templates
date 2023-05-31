package task6.factory_method;

public class ItalianTeaShop extends TeaShop{
    @Override
    public Tea createTea(TeaType type) {
        System.out.println("Italian " + type + " tea");
        if (type.equals(TeaType.GREEN))
            return new GreenTea();
        return new BlackTea();
    }
}
