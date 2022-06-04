public class PlayerX extends Game{

    public int[][] playerBoard;
    Menu menu = new Menu();
//    Game ticGame = new Game(menu.getSize());
    public PlayerX(int size){
        super(size);
    }


    public void insertX(int markPosition) {
        int positionOnBoard = 1;
        for (int i = 0; i < super.size; i++) {
            for (int j = 0; j < super.size; j++) {
                if (markPosition == positionOnBoard){
                    super.board[i][j] = 69;
                }
                positionOnBoard+=1;
            }
        }

        super.displayBoard();
    }

}
