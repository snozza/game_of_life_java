package gameoflife;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import gameoflife.Cell.CellState;

public class UniverseTest {

  private static final CellState O = CellState.DEAD;
  private static final CellState X = CellState.ALIVE;
  
  @Test
  public void storesItsInitialState() {
    CellState[][] original = new CellState[][]{
      {X, O, X},
      {O, O, O},
      {O, X, X}
    };
    Universe uut = new Universe(original);
    CellState[][] actual = uut.getState();
    assertThat(actual).isEqualTo(original);
  }

  @Test
  public void updatesCell() {
    Universe uut = new Universe(new CellState[][]{{X}});
    uut.update();
    CellState actual[][] = uut.getState();
    assertThat(actual[0][0]).isEqualTo(CellState.DEAD);
  }
}
