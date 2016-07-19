package twentyfortyeight.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by employee on 7/19/16.
 */
public class Field {
    private List<List<Cell>> field;

    public Field(){

    }

    protected void setEmptyField(){
        field = Arrays.asList(
                Arrays.asList(null,null,null,null),
                Arrays.asList(null,null,null,null),
                Arrays.asList(null,null,null,null),
                Arrays.asList(null,null,null,null));
    }

}
