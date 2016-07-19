package twentyfortyeight.model;

import org.junit.Before;
import org.junit.Test;
import sun.invoke.empty.Empty;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by employee on 7/19/16.
 */
public class FieldTest {

    private List<Cell> testCells;

    public void setTestCells(Field field){
        testCells = new ArrayList<>(16);
        testCells.addAll(field.getField().get(0));
        testCells.addAll(field.getField().get(1));
        testCells.addAll(field.getField().get(2));
        testCells.addAll(field.getField().get(3));
    }
    @Test
    public void fieldISEmptyInTheBeginning() throws Exception {
        Field field = new Field();
        field.setEmptyField();
        setTestCells(field);
        int counter=0;
        for (Cell cell:
             testCells) {
            if (!cell.getCellStatus()){
                counter++;
            }
        }
        assertThat(counter, is(0));
    }

    @Test
    public void setRandomDigitToCell() throws Exception {
        Field field = new Field();
        field.setEmptyField();
        field.setDigitToRandomCell();
        setTestCells(field);
        int counter=0;
        for (Cell cell:
                testCells) {
            if (!cell.getCellStatus()){
                counter++;
            }
        }
        assertThat(counter, is(1));
    }


}
