import java.util.LinkedList;


public class Snake {
    private LinkedList<Cell> snakeParts = new LinkedList<>();
    private Cell head;

    public Snake(Cell initPosition){
        this.head = initPosition;
        snakeParts.add(head);
        System.out.println("New snake created on the position " + initPosition.getXPosition() + " * " + initPosition.getYPosition() );
    }

    public void move(){
        
    }
}
