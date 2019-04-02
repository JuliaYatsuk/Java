public class Cell {
    private int row;
    private int column;
    private CellState cellState;

    public Cell(int row, int column, CellState cellState){
        this.row = row;
        this.column = column;
        this.cellState = cellState;
    }

    public CellState getState(){
        return cellState;
    }

    public void setState(CellState state){
        this.cellState = state ;
    }

    public int getXPosition(){
        return this.column;
    }

    public int getYPosition(){
        return this.row;
    }
}
