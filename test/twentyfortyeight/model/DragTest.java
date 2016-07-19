package twentyfortyeight.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by employee on 7/19/16.
 */
public class DragTest {
    List<List<Cell>> field;

    public void setup() {
        field = Arrays.asList(
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()));
    }

    @Test
    public void addTwoDigits() throws Exception {
        setup();
        field.get(2).get(2).setValueTwo();
        field.get(2).get(3).setValueTwo();
        RightSlide drag = new RightSlide(field);
        drag.move();
        assertThat(drag.getField().get(2).get(3).getValue(), is(4));
    }


}
