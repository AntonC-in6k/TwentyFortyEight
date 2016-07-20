package twentyfortyeight.model;

import java.util.List;
import java.util.Random;

/**
 * Created by employee on 7/20/16.
 */
public class CellSelectorImpl implements CellSelector {

    @Override
    public Cell selectEmptyCell(List<Cell> freeCells) {
        Random randomCell = new Random();
        Cell cell = freeCells.get(randomCell.nextInt(freeCells.size()));
        return cell;
    }
}
