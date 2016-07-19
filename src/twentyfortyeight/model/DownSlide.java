package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class DownSlide extends Slide {

    public DownSlide(List<List<Cell>> field) {
        super(field);
    }

    @Override
    protected void moveInLine(int index) {
        for (int i = 2; i >= 0; i--) {
            if (field.get(i).get(index).getValue() != null) {
                slideLine(index, i);
            }
        }
    }

    @Override
    protected void slideLine(int index, int i) {
        for (int j = i + 1; j < 4; j++) {
            if (field.get(j).get(index).getCellStatus()) {
                field.get(j).get(index).setValue(
                        field.get(j-1).get(index).getValue());
                field.get(j-1).get(index).resetValue();
            }
        }
    }

    @Override
    protected void addInLine(int index) {
        for (int i = 2; i >= 0; i--) {
            if (field.get(i).get(index).getValue() != null) {
                addDigits(index, i);
            }
        }
    }

    @Override
    protected void addDigits(int index, int i) {
        if (field.get(i).get(index).getValue() ==
                field.get(i+1).get(index).getValue()) {
            addTwoNearDigits(index, i);
        }
    }

    @Override
    protected void addTwoNearDigits(int row, int column) {
        field.get(column+1).get(row).increaseValue();
        field.get(column).get(row).resetValue();
    }

}
