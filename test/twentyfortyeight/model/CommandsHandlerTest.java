package twentyfortyeight.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static twentyfortyeight.model.Commands.*;

/**
 * Created by employee on 7/19/16.
 */
public class CommandsHandlerTest {

    @Test
    public void rightCommandOnWPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("w"), is(MOVE_UP));
    }

    @Test
    public void rightCommandOnSPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("s"), is(MOVE_DOWN));
    }

    @Test
    public void rightCommandOnAPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("a"), is(MOVE_LEFT));
    }

    @Test
    public void rightCommandOnDPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("d"), is(MOVE_RIGHT));
    }

    @Test
    public void rightCommandOnEPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("e"), is(EXIT));
    }

    @Test
    public void wrongCommandPress() throws Exception {
        CommandsHandler commandHandler = new CommandsHandler();
        assertThat(commandHandler.handle("h"), is(ERROR));
    }

}
