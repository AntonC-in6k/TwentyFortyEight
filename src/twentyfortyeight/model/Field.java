package twentyfortyeight.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by employee on 7/19/16.
 */
public class Field {
    private List<List<Cell>> field;
    private Cell cell;
    public Field() {
        cell= new Cell();
    }

    public List<List<Cell>> getField() {
        return field;
    }

    protected void setEmptyField() {
        field = Arrays.asList(
                Arrays.asList(cell, cell, cell, cell),
                Arrays.asList(cell, cell, cell, cell),
                Arrays.asList(cell, cell, cell, cell),
                Arrays.asList(cell, cell, cell, cell));
    }

    protected void setDigitToRandomCell(){
        Random randomCell = new Random();
        boolean foundEmptyCell=false;
        setEmptyField();
        while (!foundEmptyCell) {
            List<Integer> indexOfCell = Arrays.asList(randomCell.nextInt(4), randomCell.nextInt(4));
            if (field.get(indexOfCell.get(0)).get(indexOfCell.get(1)).getCellStatus()){
                cell.setRandomValue();
                field.get(indexOfCell.get(0)).set(indexOfCell.get(1),cell);
                foundEmptyCell=true;
            }
        }
    }
}
