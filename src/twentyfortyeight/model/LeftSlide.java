package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class LeftSlide extends Slide {

    public LeftSlide(List<List<Cell>> field) {
        super(field);
    }

    @Override
    protected void moveInLine(int row) {
        for (int column = 1; column < 4; column++) {
            if (field.get(row).get(column).getValue() != 0) {
                slideLine(row, column);
            }
        }
    }

    @Override
    protected void slideLine(int row, int currentColumn) {
        for (int column = currentColumn - 1; column >= 0; column--) {
            if (field.get(row).get(column).getCellStatus()) {
                field.get(row).get(column).setValue(
                        field.get(row).get(column + 1).getValue());
                field.get(row).get(column + 1).resetValue();
            }
        }
    }

    @Override
    protected void addInLine(int row) {
        for (int column = 1; column < 4; column++) {
            if (field.get(row).get(column).getValue() != 0) {
                addDigits(row, column);
            }
        }
    }

    @Override
    protected void addDigits(int row, int column) {
        if (field.get(row).get(column).getValue() ==
                field.get(row).get(column - 1).getValue()) {
            addTwoNearDigits(row, column);
        }
    }

    @Override
    protected void addTwoNearDigits(int row, int column) {
        field.get(row).get(column - 1).increaseValue();
        field.get(row).get(column).resetValue();
    }
}
