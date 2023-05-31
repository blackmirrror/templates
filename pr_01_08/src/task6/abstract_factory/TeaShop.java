package task6.abstract_factory;

public class TeaShop {

    GreenTea greenTea;
    BlackTea blackTea;

    public TeaShop(TeaFactory teaFactory) {
        System.out.println("Tea Shop is open");
        greenTea = teaFactory.createGreenTea();
        blackTea = teaFactory.createBlackTea();
    }
}
