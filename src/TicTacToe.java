public class TicTacToe {
    public static void main(String[] args) {
        char [][] gameBoard = { {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '} };
        printGameBoard(gameBoard);
    }

    public static void printGameBoard(char[][] gameboard){
        for(char[] row: gameboard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}