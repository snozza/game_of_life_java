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

  public void update() {
    CellState cellStates[][] = getstate();
    for (int row = 0; row < state.length; row++) {
      for (int col = 0; col < state[row].length; col++) {
        int numberOfAliveNeighbours = getNumberOfAliveNeighbours(cellStates, row, col);
        state[row][col].update(numberOfAliveNeighbours);
      }
    }
  }

  /*private int getNumberOfAliveNeighbours(CellState[][] state, int row, int col) {*/
    //int numberOfAliveNeighbours = 0;
    //if (row > 0) {
      //int rowAbove = row - 1;
      //if (col > 0) {
        //if (state[rowAbove][col - 1] == CellState.ALIVE) numberOfAliveNeighbours++;
      //}
      //if (state[rowAbove][col] == CellState.ALIVE) numberOfAliveNeighbours++;
      //if (col < state[row].length - 1) {
        //if (state[rowAbove][col + 1] == CellState.ALIVE) numberOfAliveNeighbours++;
      //}
    //}
    //if (col > 0) {
      //if (state[rowAbove][col -1] == CellState.ALIVE) numberOfAliveNeighbours++;
    /*}*/
}
