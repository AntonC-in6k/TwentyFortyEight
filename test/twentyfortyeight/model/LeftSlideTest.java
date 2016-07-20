package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 7/19/16.
 */
public class LeftSlideTest {
    private LeftSlide slide;

    private void compareFields(GameBoard gameBoard, String expected){
        slide = new LeftSlide(gameBoard.getField());
        slide.apply();
        assertThat(slide.getField(), is(new GameBoard(expected).getField()));
    }

    @Test
    public void pushDigitsToBorder() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 0, 0, 0\n" +
                        "0, 2, 0, 0\n" +
                        "0, 0, 4, 0\n" +
                        "0, 0, 0, 8\n");
        compareFields(gameBoard,
                        "2, 0, 0, 0\n" +
                        "2, 0, 0, 0\n" +
                        "4, 0, 0, 0\n" +
                        "8, 0, 0, 0\n");
    }

    @Test
    public void tryAddTwoDigitsInLine() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 0, 0, 0\n" +
                        "4, 4, 0, 0\n" +
                        "2, 2, 0, 0\n" +
                        "0, 0, 0, 0\n");
        compareFields(gameBoard,
                        "2, 0, 0, 0\n" +
                        "8, 0, 0, 0\n" +
                        "4, 0, 0, 0\n" +
                        "0, 0, 0, 0\n");
    }

    @Test
    public void pushDigitsToBorderAndAddThem() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 0, 2, 2\n" +
                        "4, 4, 4, 4\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n");
        compareFields(gameBoard,
                        "4, 2, 0, 0\n" +
                        "8, 8, 0, 0\n" +
                        "0, 0, 0, 0\n" +
                        "0, 0, 0, 0\n");
    }

}
