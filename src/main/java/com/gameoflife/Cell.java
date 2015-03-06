package gameoflife;

import gameoflife.Cell.CellState;

public class Cell {

  private CellState state;

  public Cell(CellState state) {
    this.state = state;
  }
  
  public enum CellState {
    ALIVE, DEAD
  }
}
