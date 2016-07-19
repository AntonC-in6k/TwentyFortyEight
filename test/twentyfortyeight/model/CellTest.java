package twentyfortyeight.model;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by employee on 7/19/16.
 */
public class CellTest {

    @Test
    public void getRandomValue() throws Exception {
        Cell cell = new Cell();
        cell.setRandomValue();
        assertThat(cell.getCell(), anyOf(is(2), is(4)));
    }

    @Test
    public void randomReturnFour() throws Exception {
        Cell cell = new Cell();
        List<Integer> values = new ArrayList(100);
        for (int i=0;i<=100;i++){
            cell.setRandomValue();
            values.add(cell.getCell());
        }
        assertTrue(values.contains(4));
    }

    @Test
    public void randomReturnTwo() throws Exception {
        Cell cell = new Cell();
        List<Integer> values = new ArrayList(100);
        for (int i=0;i<=100;i++){
            cell.setRandomValue();
            values.add(cell.getCell());
        }
        assertTrue(values.contains(2));
    }
}
