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
    private Cell cell;

    public Field() {
        setEmptyField();
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
        Cell cell = chooseEmptyCell(foundEmptyCell());
        cell.setRandomValue();
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

    private Cell chooseEmptyCell(List<Cell> freeCells) {
        Random randomCell = new Random();
        Cell cell = freeCells.get(randomCell.nextInt(freeCells.size()));
        return cell;
    }

}
