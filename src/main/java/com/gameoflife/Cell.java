package gameoflife;

public class Cell {

  private CellState state;

  public Cell(CellState state) {
    this.state = state;
  }
  
  public enum CellState {
    ALIVE, DEAD
  }

  public CellState getNextState(int i) {
    return CellState.DEAD;
  }
}
