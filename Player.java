import java.util.Scanner;
public class Player {

   private String name = "";
   private String symbol = "";
   private int posX = 0;
   private int posY = 0;
   public String getSymbol() {
      return symbol;
   }
   public String getName(){return name;}
   public int getX(){return posX;}
   public int getY(){return posY;}
   
   public Player(String n)
   {
      name = n;
   }
 
   public void getPosition()
   {
      Scanner stdin = new Scanner(System.in);
      int x = 0;
      int y = 0;
      System.out.print("Enter Row: ");
      x = stdin.nextInt();
      System.out.print("Enter Col: ");
      y = stdin.nextInt();
         
      while(!Validator.validatePosition(x,y))
      {
         System.out.println("Try again. ");
         System.out.println("Enter x coordinate: ");
         x = stdin.nextInt();
         System.out.println("Enter y coordinate: ");
         y = stdin.nextInt();
      }
      Validator.setTaken(x,y);
      posX = x;
      posY = y;
      
   }
   public void setSymbol()
   {
      Scanner stdin = new Scanner(System.in);
      System.out.print("Enter " + name + "'s symbol: ");
      String s = stdin.nextLine();
      while(s.length()>1)
      {
         System.out.println("Symbol can only be one letter.");
         System.out.print("Try again: ");
         s = stdin.nextLine();
      }
      symbol = s;
   }
   
}