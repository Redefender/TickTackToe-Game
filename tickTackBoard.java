public class tickTackBoard {
   private String[][] board;
   public tickTackBoard()
   {
      board = new String[3][3]; //3 rows, 3 cols
      for(int y=0;y<3;y++)
      {
         for(int x=0;x<3;x++)
         {
            board[y][x] = " ";
         }
      }
     /* board[0][2] = "t";
      board[1][1] = "m";
      System.out.println(board[0][2]);*/
   }
   public static void displayNew(){
      System.out.println("New Board");
   }
   public void displayBoard() {
      for(int y=0;y<3;y++)
      {
         for(int x=0;x<3;x++)
         {
            if(x<2)
               System.out.print("\t" + board[y][x] + "|");
            else
               System.out.print(board[y][x]);
         }
         System.out.println();
         if(y<2)
            System.out.println("------------");
      }
   }
   public void placePosition(String s,int x,int y) {
      board[x-1][y-1] = s;
   }
   public String getPos(int y, int x) { //for checkWin method
      return board[y][x];
   }
   public void clearBoard()
   {
      for(int x=0;x<3;x++)
      {
         for(int i=0;i<3;i++)
         {
            board[x][i] = " ";
         }
      }
   }
   
}