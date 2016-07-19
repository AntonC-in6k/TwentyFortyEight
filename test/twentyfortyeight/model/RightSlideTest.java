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
public class RightSlideTest {
    List<List<Cell>> field;

    public void setup() {
        field = Arrays.asList(
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()));
    }

    @Test
    public void pushDigitToBorder() throws Exception {
        setup();
        field.get(2).get(2).setValue(2);
        RightSlide slide = new RightSlide(field);
        slide.move();
        assertThat(slide.getField().get(2).get(3).getValue(), is(2));
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        setup();
        field.get(2).get(2).setValue(2);
        field.get(2).get(3).setValue(2);
        RightSlide slide = new RightSlide(field);
        slide.move();
        assertThat(slide.getField().get(2).get(3).getValue(), is(4));
    }

    @Test
    public void pushDigitToBorderAndAddThem() throws Exception {
        setup();
        field.get(2).get(0).setValue(2);
        field.get(2).get(2).setValue(2);
        RightSlide slide = new RightSlide(field);
        slide.move();
        assertThat(slide.getField().get(2).get(3).getValue(), is(4));
    }

}
