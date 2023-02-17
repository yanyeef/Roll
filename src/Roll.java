import java.util.ArrayList;

public class Roll {
    private ArrayList<Integer> board;
    private int players;
    public Roll(){
        board= new ArrayList<Integer>();
        for(int  i = 0; i < 10; i++){
            board.add(i, i+1);
        }
        System.out.println(board);
    }

    public int diceRoll(){
       int d1 = (int) (Math.random()*7);
       int d2 = (int)(Math.random()*7);
       return d1+d2;
    }

    public boolean recordMove(int spot){
        if(board.get(spot -1) != 0){
            board.set(spot-1, 0);
            return true;
        } else {
            return false;
        }
    }


    public void runGame(){
        boolean gameOver =false;
        while(!Board.isFull() && !gameOver ){
            for(int i = 0; i< players; i++){
                if()
            }
        }
    }

}
