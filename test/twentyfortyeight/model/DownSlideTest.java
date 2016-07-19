package twentyfortyeight.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class DownSlideTest {
    List<List<Cell>> field;

    public void setup() {
        field = Arrays.asList(
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()),
                Arrays.asList(new Cell(), new Cell(), new Cell(), new Cell()));
    }

    @Test
    public void pushDigitsToBorder() throws Exception {
        setup();
        field.get(2).get(2).setValue(2);
        DownSlide slide = new DownSlide(field);
        slide.move();
        assertThat(slide.getField().get(3).get(2).getValue(), is(2));
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        setup();
        field.get(3).get(2).setValue(2);
        field.get(2).get(2).setValue(2);
        DownSlide slide = new DownSlide(field);
        slide.move();
        assertThat(slide.getField().get(3).get(2).getValue(), is(4));
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        setup();
        field.get(0).get(2).setValue(2);
        field.get(2).get(2).setValue(2);
        DownSlide slide = new DownSlide(field);
        slide.move();
        assertThat(slide.getField().get(3).get(2).getValue(), is(4));
    }
}
