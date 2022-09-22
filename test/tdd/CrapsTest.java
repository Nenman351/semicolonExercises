package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class CrapsTest {

    @Test
    public void whenSumOfDiceAre7_11() {
        Craps craps = new Craps();
        craps.sumOfDice = 7;
        assertSame(craps.getStatus(), Craps.Status.WIN);
    }

    @Test
    public void whenSumOfDiceAre2_3_12(){
        Craps craps = new Craps();
        craps.sumOfDice = 2;
        assertSame(craps.getStatus(), Craps.Status.LOSE);
    }

    @Test
    public void whenSumOfDiceIsOtherThan7_11_2_3_12(){
        Craps craps = new Craps();
        craps.sumOfDice = 6;
        assertSame(craps.getStatus(), Craps.Status.CONTINUE);
    }
}
