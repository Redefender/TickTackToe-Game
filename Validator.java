import java.util.ArrayList;
public class Validator {
   private static ArrayList<Integer> takenX = new ArrayList<Integer>();
   private static ArrayList<Integer> takenY = new ArrayList<Integer>();
   
   public static boolean validatePosition(int x,int y)
   {
      for(int i = 0; i<takenX.size();i++)
      {
         if(x == takenX.get(i) && y == takenY.get(i))
         {
            System.out.println("That spot has already been taken!");
            return false;
         }
      }
      if(x > 3 || y>3 || x<1 || y<1)
      {
         System.out.println("That's out of bounds!");
         return false;
      }
      else
      {
         return true;
      }
      
   }

   public static void setTaken(int x, int y)
   {
      takenX.add(x);
      takenY.add(y);
      
   }
   public static void clearTaken()
   {
      takenX.clear();
      takenY.clear();
   }
   public static void displayTaken()
   {
      for(int i = 0;i<takenX.size();i++)
      {
         System.out.println(takenX.get(i) + " " + takenY.get(i));
      }
   }
 
   public static boolean checkWin(Player a, Player b,tickTackBoard bo)
   {
      String s1 = a.getSymbol();
      String s2 = b.getSymbol();
      boolean whoWinner = false;
      boolean roundOver = false;
      
      //determine player1 win 
      if(bo.getPos(0,0) == s1 && bo.getPos(0,1) == s1 && bo.getPos(0,2) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(1,0) == s1 && bo.getPos(1,1) == s1 && bo.getPos(1,2) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(2,0) == s1 && bo.getPos(2,1) == s1 && bo.getPos(2,2) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(0,0) == s1 && bo.getPos(1,0) == s1 && bo.getPos(2,0) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(0,1) == s1 && bo.getPos(1,1) == s1 && bo.getPos(2,1) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(0,2) == s1 && bo.getPos(1,2) == s1 && bo.getPos(2,2) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(0,0) == s1 && bo.getPos(1,1) == s1 && bo.getPos(2,2) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      else if(bo.getPos(0,2) == s1 && bo.getPos(1,1) == s1 && bo.getPos(2,0) == s1)
      {
         
         whoWinner = true;
         roundOver = true;
      }
      
      //determine player2 win 
      else if(bo.getPos(0,0) == s2 && bo.getPos(0,1) == s2 && bo.getPos(0,2) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(1,0) == s2 && bo.getPos(1,1) == s2 && bo.getPos(1,2) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(2,0) == s2 && bo.getPos(2,1) == s2 && bo.getPos(2,2) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(0,0) == s2 && bo.getPos(1,0) == s2 && bo.getPos(2,0) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(0,1) == s2 && bo.getPos(1,1) == s2 && bo.getPos(2,1) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(0,2) == s2 && bo.getPos(1,2) == s2 && bo.getPos(2,2) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(0,0) == s2 && bo.getPos(1,1) == s2 && bo.getPos(2,2) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else if(bo.getPos(0,2) == s2 && bo.getPos(1,1) == s2 && bo.getPos(2,0) == s2)
      {
         
         whoWinner = false;
         roundOver = true;
      }
      else
      {
      }
      
      if(roundOver)
      {
         if(whoWinner)
         {
            System.out.println(a.getName() + " has won! ");
         }
         else
         {
            System.out.println(b.getName() + " has won!");
         }
         return true;
      }
      else
      {
         return false; //no one has won yet
      }

   }
   public static boolean checkDraw(Player a, Player b, tickTackBoard c)
   {
      boolean isDraw = false;
      for(int x=0;x<3;x++)
      {
         for(int i=0;i<3;i++)
         {
            if(c.getPos(x,i) == b.getSymbol() || c.getPos(x,i) == b.getSymbol() )
            {
               isDraw = true;
            }
         }
      }
      return isDraw;
   }
   
}