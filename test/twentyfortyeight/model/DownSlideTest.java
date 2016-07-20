package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class DownSlideTest {
    private CellSelector cellSelector;
    private DownSlide slide;

    public void setup() {
        cellSelector = new CellSelectorImpl();
    }

    @Test
    public void pushDigitsToBorder() throws Exception {
        setup();
        Field field = new Field(cellSelector,
                        "2, 0, 0, 0\n"+
                        "0, 2, 0, 0\n"+
                        "0, 0, 4, 0\n"+
                        "0, 0, 0, 8\n");
        slide = new DownSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(cellSelector,
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "2, 2, 4, 8\n").getField())));
    }

    @Test
    public void tryAddTwoNearDigitsInLine() throws Exception {
        Field field = new Field(cellSelector,
                        "0, 0, 0, 0\n"+
                        "0, 0, 0, 0\n"+
                        "0, 2, 2, 4\n"+
                        "0, 4, 2, 4\n");
        slide = new DownSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(cellSelector,
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "0, 2, 0, 0\n" +
                                "0, 4, 4, 8\n").getField())));
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        Field field = new Field(cellSelector,
                        "2, 4, 2, 2\n"+
                        "8, 4, 4, 2\n"+
                        "0, 4, 0, 0\n"+
                        "0, 4, 0, 0\n");
        slide = new DownSlide(field.getField());

        slide.move();

        assertThat(slide.getField(),
                is((new Field(cellSelector,
                                "0, 0, 0, 0\n" +
                                "0, 0, 0, 0\n" +
                                "2, 8, 2, 0\n" +
                                "8, 8, 4, 4\n").getField())));
    }

}
