package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by employee on 7/20/16.
 */
public class ScoreTest {



    @Test
    public void increaseScoreInOneSlide() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 2, 0, 0\n" +
                        "0, 2, 0, 0\n" +
                        "0, 0, 4, 0\n" +
                        "0, 0, 0, 8\n");

        Slide slide = new RightSlide(gameBoard.getField());
        slide.apply();
        gameBoard.setField(slide.getField());
        assertThat(slide.score, is(4));
    }

    @Test
    public void increaseScoreInManySlides() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "2, 2, 0, 0\n" +
                        "2, 2, 2, 2\n" +
                        "0, 0, 4, 0\n" +
                        "0, 0, 0, 8\n");
        Slide slide = new RightSlide(gameBoard.getField());
        slide.apply();
        slide.apply();
        gameBoard.setField(slide.getField());
        assertThat(slide.score, is(20));
    }

    @Test
    public void scoreSumInDifferentSlides() throws Exception {
        GameBoard gameBoard = new GameBoard(
                        "0, 0, 0, 0\n" +
                        "0, 0, 2, 2\n" +
                        "0, 0, 4, 0\n" +
                        "0, 0, 0, 8\n");
        Slide slide = new RightSlide(gameBoard.getField());
        slide.apply();
        gameBoard.setField(slide.getField());
        slide = new DownSlide(gameBoard.getField());
        slide.apply();
        slide.apply();
        gameBoard.setField(slide.getField());
        assertThat(slide.score, is(20));
    }

}
