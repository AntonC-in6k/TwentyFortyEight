package twentyfortyeight.model;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
}
