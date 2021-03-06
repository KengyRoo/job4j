package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertival(char[][] board, int column){
        boolean result = true;
        for (int j = 0; j < board[column].length; j++){
            if (board[j][column] != 'X'){
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extraDiagonal(char[][] board){
        char[] rsl = new char[board.length];
        for (int i=0; i <board.length; i++){
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board){
        boolean result = false;
        for (int i=0; i<board.length;i++){
            if ((monoHorizontal(board,i)||monoVertival(board,i))){
                result = true;
                break;
            }
        }
        return result;
    }
}
