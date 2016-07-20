package twentyfortyeight.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class UpSlideTest {
    private UpSlide slide;

    @Test
    public void pushDigitsToBorder() throws Exception {
        Field field = new Field(
                        "2, 0, 0, 0\n"+
                        "0, 2, 0, 0\n"+
                        "0, 0, 4, 0\n"+
                        "0, 0, 0, 8\n");
        slide = new UpSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "2, 2, 4, 8\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n").getField())));
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        Field field = new Field(
                        "0, 0, 4, 2\n"+
                        "0, 0, 4, 2\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n");
        slide = new UpSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "0, 0, 8, 4\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n").getField())));
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        Field field = new Field(
                        "2, 4, 2, 2\n"+
                        "4, 4, 2, 4\n"+
                        "0, 4, 0, 0\n"+
                        "0, 4, 0, 4\n");
        slide = new UpSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "2, 8, 4, 2\n" +
                                "4, 8, 0, 8\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n").getField())));
    }

}