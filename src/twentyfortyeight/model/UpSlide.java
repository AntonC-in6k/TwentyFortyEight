package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class UpSlide extends Slide {

    public UpSlide(List<List<Cell>> field) {
        super(field);
    }

    @Override
    protected void moveInLine(int row) {
        for (int column = 1; column < 4; column++) {
            if (field.get(column).get(row).getValue() != 0) {
                slideLine(row, column);
            }
        }
    }

    @Override
    protected void slideLine(int row, int currentColumn) {
        for (int column = currentColumn - 1; column >= 0; column--) {
            if (field.get(column).get(row).getCellStatus()) {
                field.get(column).get(row).setValue(
                        field.get(column+1).get(row).getValue());
                field.get(column+1).get(row).resetValue();
            }
        }
    }

    @Override
    protected void addInLine(int row) {
        for (int column = 1; column < 4; column++) {
            if (field.get(column).get(row).getValue() != 0) {
                addDigits(row, column);
            }
        }
    }

    @Override
    protected void addDigits(int row, int column) {
        if (field.get(column).get(row).getValue() ==
                field.get(column-1).get(row).getValue()) {
            addTwoNearDigits(row, column);
        }
    }

    @Override
    protected void addTwoNearDigits(int row, int column) {
        field.get(column-1).get(row).increaseValue();
        field.get(column).get(row).resetValue();
    }
}
