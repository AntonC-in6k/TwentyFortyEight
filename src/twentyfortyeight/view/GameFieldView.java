package twentyfortyeight.view;

import twentyfortyeight.model.Cell;
import twentyfortyeight.model.GameBoard;

import java.util.List;

/**
 * Created by employee on 7/20/16.
 */
public class GameFieldView {

    public void show(GameBoard gameBoard){

        System.out.println(formatField(gameBoard));
    }

    private String formatField(GameBoard gameBoard) {
        String result="";
        for (int i=0;i<4;i++){
            formatRow(gameBoard.getField().get(i));
        }
        return result;
    }

    private String formatRow(List<Cell> row) {
        String result="";
        for (int i=0;i<4;i++){
            formatCell(row.get(i));
        }
        return result;
    }

    private String formatCell(Cell cell) {
        String result="";

        return result;
    }
}
