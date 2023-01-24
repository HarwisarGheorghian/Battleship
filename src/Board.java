public class Board {
    public static final int LENGTH = 7;
    public static final int WIDTH = 6;

    public void displayChessBoard(){
       for (int row = 0; row < LENGTH; row++)
       {
           System.out.println("");
           System.out.println("---------------------------------");
 
           for (int column = 0; column < WIDTH; column++)
           {
               System.out.print("| " + " " + " ");
           }           
     }
     System.out.println("");
     System.out.println("---------------------------------");
   }

   public Board(){
    
   }
}