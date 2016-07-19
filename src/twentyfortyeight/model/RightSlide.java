package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class RightSlide extends Drag {

    public RightSlide(List<List<Cell>> field) {
        super(field);
    }

    protected void moveInLine(int index){
        if(field.get(index).get(2).getValue()==field.get(index).get(3).getValue()){
            field.get(index).get(3).increaseValue();
            field.get(index).get(2).resetValue();
            field.get(index).get(2).setToEmpty();
        }
    }
}
