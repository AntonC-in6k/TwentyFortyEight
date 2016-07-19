package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class RightSlide extends Slide {

    public RightSlide(List<List<Cell>> field) {
        super(field);
    }

    protected void moveInLine(int index) {
        for (int i = 2; i >= 0; i--) {
            if (field.get(index).get(i).getValue() == null) {
                break;
            }

            for (int j = i+1; j < 4; j++) {
                if (field.get(index).get(j).getCellStatus()){
                    field.get(index).get(j).setValue(
                            field.get(index).get(i).getValue());
                    field.get(index).get(i).resetValue();
                }
            }

            if (field.get(index).get(i).getValue() == field.get(index).get(i + 1).getValue()) {
                addTwoDigits(index, i);
            }

        }

    }

    private void swapCells() {

    }

    protected void addTwoDigits(int row, int column) {
        field.get(row).get(column + 1).increaseValue();
        field.get(row).get(column).resetValue();
    }
}
