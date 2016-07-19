package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class RightSlide extends Drag {

    public RightSlide(List<List<Cell>> field) {
        super(field);
    }

    protected void moveInLine(int index) {
        for (int i = 2; i >= 0; i--) {
            if (field.get(index).get(i).getValue() == null) {
                break;
            }
            if (field.get(index).get(i).getValue() == field.get(index).get(i + 1).getValue()) {
                addTwoDigits(index, i);
            }
            for (int j = i; j < 4; j++) {

            }
        }

    }

    protected void addTwoDigits(int row, int column) {
        field.get(row).get(column + 1).increaseValue();
        field.get(row).get(column).resetValue();
        field.get(row).get(column).setToEmpty();
    }
}
