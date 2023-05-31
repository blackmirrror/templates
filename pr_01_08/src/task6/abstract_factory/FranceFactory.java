package task6.abstract_factory;

public class FranceFactory implements TeaFactory{

    public FranceFactory() {
        System.out.println("France Factory was created");
    }

    @Override
    public GreenTea createGreenTea() {
        System.out.println("France Green Tea was created");
        return new FranceGreenTea();
    }

    @Override
    public BlackTea createBlackTea() {
        System.out.println("France Black Tea was created");
        return new FranceBlackTea();
    }
}
