public class BattleShipBoard{

  private char[][] board = {
                              {' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' '},
                              {' ', ' ', ' ', ' ', ' '}
                           };
  
  public BattleShipBoard(){
    //board is initialized  
  }
  
  public void setupShips(int x, int y){
    board[x][y] = '.'; 
  }
  
  public void printBoard(){
    System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | " + board[0][4]  + " | ");
    System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4]  + " | ");
    System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4]  + " | ");
    System.out.println(" | " + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4]  + " | ");
    System.out.println(" | " + board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4]  + " | ");
  }
  
}