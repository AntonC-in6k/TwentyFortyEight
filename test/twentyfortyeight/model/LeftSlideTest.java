package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class LeftSlideTest {
    private LeftSlide slide;


    @Test
    public void pushDigitsToBorder() throws Exception {
        Field field = new Field(
                        "2, 0, 0, 0\n"+
                        "0, 2, 0, 0\n"+
                        "0, 0, 4, 0\n"+
                        "0, 0, 0, 8\n");
        slide = new LeftSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "2, 0, 0, 0\n" +
                                "2, 0, 0, 0\n" +
                                "4, 0, 0, 0\n" +
                                "8, 0, 0, 0\n").getField())));
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        Field field = new Field(
                        "2, 0, 0, 0\n"+
                        "4, 4, 0, 0\n"+
                        "2, 2, 0, 0\n"+
                        "0, 0, 0, 0\n");
        slide = new LeftSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "2, 0, 0, 0\n" +
                                "8, 0, 0, 0\n" +
                                "4, 0, 0, 0\n" +
                                "0, 0, 0, 0\n").getField())));
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        Field field = new Field(
                        "2, 0, 2, 2\n"+
                        "4, 4, 4, 4\n"+
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n");
        slide = new LeftSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(
                                "4, 2, 0, 0\n" +
                                "8, 8, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n").getField())));
    }

}
