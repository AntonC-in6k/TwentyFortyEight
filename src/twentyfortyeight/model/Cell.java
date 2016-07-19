package twentyfortyeight.model;

import java.util.Random;

/**
 * Created by employee on 7/19/16.
 */
public class Cell {
    private Integer value;
    private boolean cellEmpty;

    public Cell(){
        cellEmpty=true;
    }


    public Integer getValue() {
        return value;
    }

    public boolean getCellStatus(){
        return cellEmpty;
    }

    public void setRandomValue() {
        Random random = new Random();
        value = random.nextInt(4);
        if (value < 3) {
            value = 2;
        } else {
            value = 4;
        }
        setNotEmpty();
    }

    private void setNotEmpty(){
        cellEmpty =false;
    }
}
