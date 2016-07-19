package twentyfortyeight;

import org.junit.Test;
import twentyfortyeight.model.Field;


import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by employee on 7/19/16.
 */
public class GameTest {

    @Test
    public void startGameReturnField() throws Exception {
        Game game = new Game();
        assertTrue(game.startGame() instanceof Field);
    }
}
