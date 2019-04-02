public class Game {

    private boolean gameState;

    public Game(Board board,Snake snake){
         this.gameState=true;
    }

    private boolean setGameState(boolean state) {
       return  this.gameState = state;
    }

    public boolean isGameOn(){
        return gameState;
    }


}
