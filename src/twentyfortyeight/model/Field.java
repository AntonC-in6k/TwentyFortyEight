package twentyfortyeight.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by employee on 7/19/16.
 */
public class Field {
    private List<List<Cell>> field;
    private CellSelector cellSelector;

    public Field(CellSelector cellSelector) {
        this.cellSelector = cellSelector;
        setEmptyField();
    }

    public Field(CellSelector cellSelector,String field) {
        this.cellSelector = cellSelector;
        setEmptyField();
        for (int i = 0; i < 4; i++) {
            String row = field.split("\\n")[i];
            for (int j = 0; j < 4; j++) {
                this.field.get(i).set(j,
                        new Cell(Integer.parseInt(row.split(",")[j].trim())));
            }
        }
    }

    public List<List<Cell>> getField() {
        return field;
    }

    public void setEmptyField() {
        field = Arrays.asList(
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()));
    }

    public void setDigitToRandomCell() {
        Cell cell = selectCell(foundEmptyCell());
        cell.setValue(cell.setRandomValue());
    }

    public Cell selectCell(List<Cell> cells){
       return cellSelector.selectEmptyCell(cells);
    }

    private List<Cell> foundEmptyCell() {
        List<Cell> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (field.get(i).get(j).getCellStatus()) {
                    result.add(field.get(i).get(j));
                }
            }
        }
        return result;
    }

}
