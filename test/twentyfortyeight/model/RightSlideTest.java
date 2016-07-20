package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class RightSlideTest {
    private RightSlide slide;

    @Test
    public void pushDigitsToBorder() throws Exception {
        Field field = new Field(
                        "2, 0, 0, 0\n"+
                        "0, 2, 0, 0\n"+
                        "0, 0, 4, 0\n"+
                        "0, 0, 0, 8\n");
        slide = new RightSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                        "0, 0, 0, 2\n" +
                        "0, 0, 0, 2\n" +
                        "0, 0, 0, 4\n" +
                        "0, 0, 0, 8\n").getField())));
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        Field field = new Field(
                        "0, 0, 2, 2\n"+
                        "0, 0, 4, 4\n"+
                        "0, 0, 2, 4\n"+
                        "0, 0, 0, 0\n");
        slide = new RightSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                        "0, 0, 0, 4\n"+
                        "0, 0, 0, 8\n"+
                        "0, 0, 2, 4\n"+
                        "0, 0, 0, 0\n").getField())));
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        Field field = new Field(
                        "2, 0, 2, 2\n"+
                        "4, 4, 4, 4\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n");
        slide = new RightSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                        "0, 0, 2, 4\n"+
                        "0, 0, 8, 8\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n").getField())));
    }

}
