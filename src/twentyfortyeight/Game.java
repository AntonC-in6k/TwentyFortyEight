package twentyfortyeight;

import twentyfortyeight.model.GameBoard;

/**
 * Created by employee on 7/19/16.
 */
public class Game {

    private GameBoard gameGameBoard;

    public void startGame() {
        gameGameBoard = new GameBoard();
        gameGameBoard.setEmptyField();
        gameGameBoard.setDigitToRandomCell();
        gameGameBoard.setDigitToRandomCell();
        showInterface();
    }

    public GameBoard getGameGameBoard(){
        return gameGameBoard;
    }

    public void showInterface(){

    }


}
