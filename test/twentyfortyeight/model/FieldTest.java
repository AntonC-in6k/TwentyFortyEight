package twentyfortyeight.model;

import org.junit.Test;
import sun.invoke.empty.Empty;


import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by employee on 7/19/16.
 */
public class FieldTest {

    @Test
    public void fieldISEmptyInTheBeginning() throws Exception {
        Field field = new Field();
        field.setEmptyField();
        List<Integer> emptyLine = Arrays.asList(null, null, null, null);
        assertThat(emptyLine, allOf(
                is(field.getField().get(0)),
                is(field.getField().get(1)),
                is(field.getField().get(2)),
                is(field.getField().get(3))));

    }

    @Test
    public void setRandomDigitToCell() throws Exception {
        Field field = new Field();
        field.setDigitToRandomCell();
        List<Integer> emptyLine = Arrays.asList(null, null, null, null);
        assertThat(emptyLine, anyOf(
                not(field.getField().get(0)),
                not(field.getField().get(1)),
                not(field.getField().get(2)),
                not(field.getField().get(3))));
    }

    @Test
    public void setTwoRandomDigits() throws Exception {
        Field field = new Field();
        field.setDigitToRandomCell();
        List<Integer> emptyLine = Arrays.asList(null, null, null, null);
        assertThat(emptyLine, anyOf(
                not(field.getField().get(0)),
                not(field.getField().get(1)),
                not(field.getField().get(2)),
                not(field.getField().get(3))));
    }

}
