package task08.observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StorePage implements Observer {
    private String game;
    private Date releaseDate;

    public void showInfo() {
        String pattern = "dd-MM-yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        System.out.println("Игра " +
                game + " выйдет "
                + df.format(releaseDate));
    }

    @Override
    public void update(String game, Date date) {
        this.game = game;
        releaseDate = date;
        showInfo();
    }
}
