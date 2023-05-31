package task7.facade;

// Фасад помогает скрыть способ реализации сложной системы
// и предоставляет клиенту простой интерфейс
// взаимодействия с ней. Другими словами, данный
// паттерн проектирования используется в качестве “обертки”,
// скрывающей детали реализации.

public class Facade {
    private final Subsystem1 subsystem1;
    private final Subsystem2 subsystem2;
    private final Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void init() {
        subsystem1.start();
        subsystem2.start();
        subsystem3.start();
    }
}
