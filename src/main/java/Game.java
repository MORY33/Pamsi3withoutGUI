public class Game implements CreateGame{

    public boolean isWon;
    public int[][] board;
    public int size;

    public static final String RESET = "\033[0m";  // Text Reset
    //colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN

    public Game(int size) {
        this.board = new int[size][size];
        this.size = size;
    }



    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public void setWon(boolean won) {
        isWon = won;
    }


    @Override
    public void createTicGame(int size) {
        createBoard(size);
    }

    @Override
    public boolean isFull() {
        int positionOnBoard=1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 69){
                    return true;
                }
                positionOnBoard+=1;
            }
        }
        return false;
    }

    @Override
    public boolean isWon() {
        if(isWon == true) return true;
        return false;
    }

    @Override
    public void displayBoard() {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    if (board[i][j] < 10 ) {
                      System.out.print(board[i][j] + "  ");
                    }
                    else{
                       System.out.print(board[i][j] + " ");
                    }
                }
                System.out.println("");
            }
        System.out.println("");
    }

    @Override
    public void createBoard(int size) {

//        board = new int[size][size];
        int g = 1;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = g;
                g+=1;
            }
        }


    }

    @Override
    public void updateBoard() {


    }

    @Override
    public void createBoard(int size, int mark) {
        int g =1 ;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (mark == g) {
                    board[row][col] = 69;
                }
                else
                    board[row][col] = g;
                g += 1;
            }
        }


    }

}
