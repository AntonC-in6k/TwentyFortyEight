package twentyfortyeight.view;

import twentyfortyeight.model.Cell;
import twentyfortyeight.model.Field;

import java.util.List;

/**
 * Created by employee on 7/20/16.
 */
public class GameFieldView {

    public void show(Field field){

        System.out.println(formatField(field));
    }

    private String formatField(Field field) {
        String result="";
        for (int i=0;i<4;i++){
            formatRow(field.getField().get(i));
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
