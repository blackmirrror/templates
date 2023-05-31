package task6.abstract_factory;

public class ItalianFactory implements TeaFactory{

    public ItalianFactory() {
        System.out.println("Italian Factory was created");
    }
    @Override
    public GreenTea createGreenTea() {
        System.out.println("Italian Green Tea was created");
        return new ItalianGreenTea();
    }

    @Override
    public BlackTea createBlackTea() {
        System.out.println("Italian Black Tea was created");
        return new ItalianBlackTea();
    }
}
