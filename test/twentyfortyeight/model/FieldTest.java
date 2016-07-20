package twentyfortyeight.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class FieldTest implements CellSelector,ValueGenerator {

    private List<Cell> testCells;

    @Override
    public Cell selectEmptyCell(List<Cell> freeCells) {
        Cell cell = freeCells.get(0);
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
        Field field = new Field(this,
                        "2, 0, 0, 0\n"+
                        "0, 2, 0, 0\n"+
                        "0, 0, 2, 0\n"+
                        "0, 0, 0, 2\n");

        assertThat(field.getField(),is(Arrays.asList(
                Arrays.asList(new Cell(2), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(2), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(2), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell(2)))));

    }

    @Test
    public void setRandomDigitToCell() throws Exception {
        Field field = new Field(this);
        Setup(field.getField());

        field.selectCell(testCells).setValue(setRandomValue());

        assertThat(field.getField(),
                is((new Field(this,
                        "2, 0, 0, 0\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n").getField())));
    }


}
