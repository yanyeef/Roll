import java.util.ArrayList;
public class Board {
    private ArrayList<Integer> board;
    public Board(){
        board= new ArrayList<Integer>();
        for(int  i = 0; i < 10; i++){
            board.add(i, i+1);
        }
        System.out.println(board);
    }

    public boolean recordMove(int spot){
        if(board.get(spot -1) != 0){
            board.set(spot-1, 0);
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i) != 0) {
                return false;
            }
        }
        return true;
    }




}
