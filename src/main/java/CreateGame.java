interface CreateGame {


//    0 --> empty
//    1 --> x
//    2 ---> 0

    void createTicGame(int size);
    boolean isFull();
    boolean isWon();
    void displayBoard();
    void createBoard(int size);

    void updateBoard();

    void createBoard(int size, int mark);
}
