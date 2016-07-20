package twentyfortyeight;

import twentyfortyeight.model.CellSelector;
import twentyfortyeight.model.CellSelectorImpl;
import twentyfortyeight.model.Field;

/**
 * Created by employee on 7/19/16.
 */
public class Game {

    private Field gameField;
    private CellSelector cellSelector;

    public Game(){
        cellSelector = new CellSelectorImpl();
    }

    public Game(CellSelector cellSelector){
        this.cellSelector = cellSelector;
    }

    public void startGame() {
        gameField = new Field(cellSelector);
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
