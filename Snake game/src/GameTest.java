import org.junit.jupiter.api.Test;


public class GameTest {

    @Test
    public void ShouldTestGame(){
        Board board = new Board(2,2);
        Snake snake = new Snake(board.getCell(0,0));
        Game game = new Game(board, snake);
        board.generateFood();
        System.out.println("New game started: " + game.isGameOn());

    }
}
