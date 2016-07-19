package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public abstract class Drag {

    protected List<List<Cell>> field;

    public Drag(List<List<Cell>> field){
        this.field=field;
    }

    public void move() {
        for (int i=0;i<4;i++){
            moveInLine(2);
        }
    }

    protected abstract void moveInLine(int index);


    public List<List<Cell>> getField(){
        return field;
    }
}
