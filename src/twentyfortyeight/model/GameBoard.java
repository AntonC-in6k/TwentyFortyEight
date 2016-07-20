package twentyfortyeight.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class GameBoard {
    public final static int FIELD_SIZE = 4;

    private List<List<Cell>> field;
    private CellSelector cellSelector;

    public GameBoard() {
        this.cellSelector = new CellSelectorImpl();
        setEmptyField();
    }

    public GameBoard(CellSelector cellSelector) {
        this.cellSelector = cellSelector;
        setEmptyField();
    }

    public GameBoard(CellSelector cellSelector, String field) {
        this.cellSelector = cellSelector;
        setEmptyField();
        parseToCells(field);
    }

    public GameBoard(String field) {
        this.cellSelector = new CellSelectorImpl();
        setEmptyField();
        parseToCells(field);
    }

    public List<List<Cell>> getField() {
        return field;
    }

    public void setField(List<List<Cell>> field){
        this.field=field;
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

    public Cell selectCell(List<Cell> cells) {
        return cellSelector.selectEmptyCell(cells);
    }

    private List<Cell> foundEmptyCell() {
        List<Cell> result = new ArrayList<>();
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field.get(i).get(j).getCellStatus()) {
                    result.add(field.get(i).get(j));
                }
            }
        }
        return result;
    }

    private void parseToCells(String field) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            String row = field.split("\\n")[i];
            for (int j = 0; j < FIELD_SIZE; j++) {
                this.field.get(i).set(j,
                        new Cell(Integer.parseInt(row.split(",")[j].trim())));
            }
        }
    }

}
