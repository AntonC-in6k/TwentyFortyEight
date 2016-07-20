package twentyfortyeight.model;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class GameBoardTest implements CellSelector,ValueGenerator {

    private List<Cell> testCells;

    @Override
    public Cell selectEmptyCell(List<Cell> freeCells) {
        Cell cell;
        if (freeCells.get(0).getCellStatus()){
            cell = freeCells.get(0);
        } else {
            cell = freeCells.get(1);
        }
        return cell;
    }

    @Override
    public int setRandomValue() {
        return 2;
    }

    private void Setup(List<List<Cell>> field){
        testCells = new ArrayList<>(16);
        testCells.addAll(field.get(0));
        testCells.addAll(field.get(1));
        testCells.addAll(field.get(2));
        testCells.addAll(field.get(3));
    }

    @Test
    public void parseStringToCells() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 0, 0, 0\n" +
                        "0, 2, 0, 0\n" +
                        "0, 0, 2, 0\n" +
                        "0, 0, 0, 2\n");

        assertThat(gameBoard.getField(),is(Arrays.asList(
                Arrays.asList(new Cell(2), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(2), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(2), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell(2)))));

    }

    @Test
    public void setRandomDigitToCell() throws Exception {
        GameBoard gameBoard = new GameBoard(this);
        Setup(gameBoard.getField());

        gameBoard.selectCell(testCells).setValue(setRandomValue());

        assertThat(gameBoard.getField(),
                is((new GameBoard(
                        "2, 0, 0, 0\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n").getField())));
    }

    @Test
    public void gameStartTest() throws Exception {
        GameBoard gameBoard = new GameBoard(this);
        Setup(gameBoard.getField());

        gameBoard.selectCell(testCells).setValue(setRandomValue());
        gameBoard.selectCell(testCells).setValue(setRandomValue());

        assertThat(gameBoard.getField(),
                Matchers.is(new GameBoard(this,
                        "2, 2, 0, 0\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n").getField()));
    }
}
