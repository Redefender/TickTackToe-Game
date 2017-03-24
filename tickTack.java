import java.util.Scanner;
public class tickTack {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
   
      
      tickTackBoard boardTester = new tickTackBoard();
    
      boolean gameRunning = true;
      tickTackBoard board = new tickTackBoard();
      
      System.out.print("Enter Player 1 name: ");
      Player player1 = new Player(stdin.nextLine());
      System.out.print("Enter Player 2 name: ");
      Player player2 = new Player(stdin.nextLine());
      player1.setSymbol();
      player2.setSymbol();
      while(gameRunning)
      {
         
         boolean isPlayer1 = true;
         boolean isPlayer2 = true;
         
         
         while(isPlayer1)
         {
            
            System.out.println(player1.getName() + "'s turn");
            player1.getPosition();
            board.placePosition(player1.getSymbol(),player1.getX(),player1.getY());
            board.displayBoard();
            isPlayer1 =false;
         }
         while(isPlayer2)
         {
            System.out.println(player2.getName() + "'s turn");
            player2.getPosition();
            board.placePosition(player2.getSymbol(),player2.getX(),player2.getY());
            board.displayBoard();
            isPlayer2 = false;
         }
         if(Validator.checkWin(player1,player2,board) || Validator.checkDraw(player1,player2,board)) //if roundOver
         {
            Validator.displayTaken();
            Validator.clearTaken();
            Validator.displayTaken();
            boolean g = gameAgain();
            if(g)
            {
               gameRunning = true;
            }
            else
            {
               gameRunning = false;
            }
         }
         else
         {
            
         }   
      }
      

   }//end main
   public static boolean gameAgain()
   {
      Scanner stdin = new Scanner(System.in);
      String c = "";
      System.out.println("Would you like to play again?");
      c = stdin.nextLine().toUpperCase();
      while(!"Y".equals(c) && !"N".equals(c))
      {
         System.out.println("Enter either Y or N: ");
         c = stdin.nextLine().toUpperCase();
      }
      if("Y".equals(c))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
}