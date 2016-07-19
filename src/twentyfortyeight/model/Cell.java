package twentyfortyeight.model;

import java.util.Random;

/**
 * Created by employee on 7/19/16.
 */
public class Cell {
    private int cell;

    public int getCell() {
        return cell;
    }

    public void setRandomValue() {
        Random random = new Random();
        cell = random.nextInt(4);
        if (cell < 3) {
            cell = 2;
        } else {
            cell = 4;
        }
    }
}
