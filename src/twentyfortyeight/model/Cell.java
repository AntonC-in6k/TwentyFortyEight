package twentyfortyeight.model;

import java.util.Random;

/**
 * Created by employee on 7/19/16.
 */
public class Cell implements ValueGenerator  {
    private Integer value;
    private boolean cellEmpty;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (cellEmpty != cell.cellEmpty) return false;
        return value.equals(cell.value);

    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + (cellEmpty ? 1 : 0);
        return result;
    }

    public Cell() {
        value = 0;
        cellEmpty = true;
    }

    public Cell(int value) {
        this.value = value;
        if (value == 0) {
            cellEmpty = true;
        } else {
            cellEmpty = false;
        }

    }

    public Integer getValue() {
        return value;
    }

    public boolean getCellStatus() {
        return cellEmpty;
    }

    @Override
    public int setRandomValue() {
        int result;
        Random random = new Random();
        result = random.nextInt(4);
        result = result < 3 ? 2 : 4;
        return result;
    }

    public void increaseValue() {
        value = value * 2;
    }

    public void setValue(int value) {
        this.value = value;
        setNotEmpty();
    }

    public void resetValue() {
        value = 0;
        setToEmpty();
    }

    private void setToEmpty() {
        cellEmpty = true;
    }

    private void setNotEmpty() {
        cellEmpty = false;
    }
}
