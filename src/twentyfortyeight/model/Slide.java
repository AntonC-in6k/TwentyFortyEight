package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public abstract class Slide {

    protected List<List<Cell>> field;

    public Slide(List<List<Cell>> field) {
        this.field = field;
    }

    public void move() {
        for (int i = 0; i < 4; i++) {
            moveInLine(i);
            addInLine(i);
            moveInLine(i);
        }
    }

    protected abstract void moveInLine(int index);

    protected abstract void slideLine(int row, int column);

    protected abstract void addInLine(int index);

    protected abstract void addDigits(int row, int column);

    protected abstract void addTwoNearDigits(int row, int column);

    public List<List<Cell>> getField() {
        return field;
    }
}
