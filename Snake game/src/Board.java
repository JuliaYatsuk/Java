public class Board {
    final int WIDTH, LENGTH;
    private Cell[][] cells;

    public Board(int width, int length){
        this.LENGTH = length;
        this.WIDTH = width;
        cells = new Cell[width][length];
        for(int i=0; i<width; i++){
            for(int j=0; j<length; j++) {
                cells[i][j] = new Cell(i, j, CellState.EMPTY);
            }
        }
        System.out.println("New Board " + length +" * " + width +  " created " );
    }

    public Cell getCell(int i, int j){
        return this.cells[i][j];
    }

    public void getCellsStates(){
        for(int i=0; i<WIDTH; i++){
            for(int j=0; j<LENGTH; j++) {
                System.out.println(cells[i][j].getState() );
            }
        }
    }

    public void generateFood(){
        int row = (int) (Math.random() * LENGTH);
        int column = (int) (Math.random() * WIDTH);
        cells[column][row].setState(CellState.FOOD);
        System.out.println("New food generated on " + row + " * " + column);
    }
}
