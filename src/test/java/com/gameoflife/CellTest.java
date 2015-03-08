package gameoflife;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.assertj.core.api.Assertions.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import gameoflife.Cell.CellState;

@RunWith(JUnitParamsRunner.class)
public class CellTest {

  @Test
  @Parameters({
    "ALIVE, 0, DEAD",
    "ALIVE, 1, DEAD",
    "ALIVE, 2, ALIVE",
    "ALIVE, 3, ALIVE",
    "ALIVE, 4, DEAD",
    "ALIVE, 5, DEAD",
    "ALIVE, 6, DEAD",
    "ALIVE, 7, DEAD",
    "ALIVE, 8, DEAD",
    "ALIVE, 9, DEAD",
    "DEAD, 0, DEAD",
    "DEAD, 0, DEAD",
    "DEAD, 0, DEAD",
    "DEAD, 3, ALIVE",
    "DEAD, 4, DEAD",
    "DEAD, 5, DEAD",
    "DEAD, 6, DEAD",
    "DEAD, 7, DEAD",
    "DEAD, 8, DEAD",
    "DEAD, 9, DEAD"})

  public void fulfillsStateTransitions(String initial, int noOfNeighbours, String expected) {
    CellState initialState = CellState.valueOf(initial);
    Cell uut = new Cell(initialState);
    CellState expectedState = Cell.CellState.valueOf(expected);
    CellState actual = uut.getNextState(noOfNeighbours);
    assertThat(actual).isEqualTo(expectedState);
  }

}


