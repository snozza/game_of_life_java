package gameoflife;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import gameoflife.Cell.CellState;

public class CellTest {

  @Test
  public void diesWithOnlyOneNeighbour() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD; 
    assertThat(uut.getNextState(1)).isEqualTo(expected);
  }

  @Test
  public void diesWithZeroNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uu.getNextState(0)).isEqualTo(expected);
  }
}
