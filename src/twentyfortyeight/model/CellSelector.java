package twentyfortyeight.model;

import java.util.List;

/**
 * Created by employee on 7/20/16.
 */
public interface CellSelector {

    public Cell selectEmptyCell(List<Cell> freeCells);

}
