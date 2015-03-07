package gameoflife;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CellTest {

  @Test
  public void diesWithOnlyOneNeighbour() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    uut.getNextState(1);
  }
}
