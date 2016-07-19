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
    protected void moveInLine(int index) {
        for (int i = 1; i < 4; i++) {
            if (field.get(index).get(i).getValue() != null) {
                slideLine(index, i);
            }
        }
    }

    @Override
    protected void slideLine(int index, int i) {
        for (int j = i - 1; j >= 0; j--) {
            if (field.get(index).get(j).getCellStatus()) {
                field.get(index).get(j).setValue(
                        field.get(index).get(j + 1).getValue());
                field.get(index).get(j + 1).resetValue();
            }
        }
    }

    @Override
    protected void addInLine(int index) {
        for (int i = 1; i < 4; i++) {
            if (field.get(index).get(i).getValue() != null) {
                addDigits(index, i);
            }
        }
    }

    @Override
    protected void addDigits(int index, int i) {
        if (field.get(index).get(i).getValue() ==
                field.get(index).get(i - 1).getValue()) {
            addTwoNearDigits(index, i);
        }
    }

    @Override
    protected void addTwoNearDigits(int row, int column) {
        field.get(row).get(column - 1).increaseValue();
        field.get(row).get(column).resetValue();
    }
}
