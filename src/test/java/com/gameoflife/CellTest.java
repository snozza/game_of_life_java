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
  public void diesWithOnlyOneNeighbour() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD; 
    assertThat(uut.getNextState(1)).isEqualTo(expected);
  }

  @Test
  public void diesWithZeroNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uut.getNextState(0)).isEqualTo(expected);
  }

  @Test
  public void livesOnWithTwoNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.ALIVE;
    assertThat(uut.getNextState(2)).isEqualTo(expected);
  }

  @Test
  public void livesOnWithThreeNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.ALIVE;
    assertThat(uut.getNextState(2)).isEqualTo(expected);
  }

  @Test public void diesWithFourNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uut.getNextState(4)).isEqualTo(expected);
  }

  @Test public void diesWithFiveNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uut.getNextState(5)).isEqualTo(expected);
  }
  
  @Test public void diesWithSixNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uut.getNextState(6)).isEqualTo(expected);
  }

  @Test public void diesWithSevenNeighbours() {
    Cell uut = new Cell(Cell.CellState.ALIVE);
    CellState expected = Cell.CellState.DEAD;
    assertThat(uut.getNextState(7)).isEqualTo(expected);
  }

  @Test public void becomesAliveWithThreeNeighbours() {
    Cell uut = new Cell(Cell.CellState.DEAD);
    CellState expected = Cell.CellState.ALIVE;
    assertThat(uut.getNextState(3)).isEqualTo(expected);
  }
}
