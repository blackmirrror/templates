package task6.factory_method;

public abstract class TeaShop {

    public Tea orderTea(TeaType type) {
        Tea tea = createTea(type);
        tea.makeTea();
        return tea;
    }
    public abstract Tea createTea(TeaType type);
}
