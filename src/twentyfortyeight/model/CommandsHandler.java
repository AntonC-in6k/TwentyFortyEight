package twentyfortyeight.model;

import java.io.IOException;

import static twentyfortyeight.model.Commands.*;

/**
 * Created by employee on 7/18/16.
 */
public class CommandsHandler {

    public Commands handle(String command) throws IOException {
        return chooseCommand(command);
    }

    private Commands chooseCommand(String command) throws IOException {
        switch (command) {
            case "d":
                return MOVE_RIGHT;

            case "a":
                return MOVE_LEFT;

            case "w":
                return MOVE_UP;

            case "s":
                return MOVE_DOWN;

            case "e":
                return EXIT;

            default:
                return ERROR;
        }
    }


}
