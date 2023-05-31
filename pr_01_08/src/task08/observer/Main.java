package task08.observer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GameRelease observable = new GameRelease("CS");
        StorePage observer = new StorePage();
        observable.attach(observer);
        observable.changeReleaseDate(new Date(23, Calendar.FEBRUARY, 2));
        observer.showInfo();
        observable.changeReleaseDate(new Date(23, Calendar.JANUARY, 12));
    }
}
