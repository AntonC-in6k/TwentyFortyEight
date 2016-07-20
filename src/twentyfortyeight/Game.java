package twentyfortyeight;

import twentyfortyeight.model.CellSelector;
import twentyfortyeight.model.CellSelectorImpl;
import twentyfortyeight.model.Field;

/**
 * Created by employee on 7/19/16.
 */
public class Game {

    private Field gameField;

    public void startGame() {
        gameField = new Field();
        gameField.setEmptyField();
        gameField.setDigitToRandomCell();
        gameField.setDigitToRandomCell();
        showInterface();
    }

    public Field getGameField(){
        return gameField;
    }

    public void showInterface(){

    }


}
