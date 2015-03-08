package gameoflife;

import gameoflife.Cell.CellState;

public class Universe {

  private Cell[][] state;

  public Universe(CellState[][] cellstates) {
    state = new Cell[cellstates.length][];
    for (int row = 0; row < cellstates.length; row++) {
      state[row] = new Cell[cellstates[row].length];
      for (int col = 0; col < cellstates[row].length; col++) {
        state[row][col] = new Cell(cellstates[row][col]);
      }
    }
  }
  
  public CellState[][] getState() {
    CellState[][] cellstates = new CellState[state.length][];
    for (int row = 0; row < state.length; row++) {
      cellstates[row] = new CellState[state[row].length];
      for (int col = 0; col < state[row].length; col++) {
        cellstates[row][col] = state[row][col].getState();
      }
    }
    return cellstates;
  }
}
