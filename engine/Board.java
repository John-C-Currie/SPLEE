package engine;

public class Board{
    private int[][] board;
    private int height;
    private int width;

    public Board(int height, int width){
        this.height = height;
        this.width = width;
        this.board = new int[height][width];
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public int[][] getBoard(){
        return this.board;
    }

    public void setBoard(int[][] board){
        this.board = board;
    }

    public void setBoard(int row, int col, int value){
        this.board[row][col] = value;
    }

    public int getCell(int row, int col){
        return this.board[row][col];
    }
}