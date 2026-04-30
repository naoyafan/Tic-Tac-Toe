import java.util.Scanner;
/**
 * Write a description of class InteractivePlayer here.
 * Represents a player controlled by a person in Tic Tac Toe 
 * @author (Sterling)
 * @version (4/29/26)
 */
public class InteractivePlayer extends Player
{
   private Scanner scan;
   /**
    * Constructor for giving the players symbol and new scan
    * @param s The String symbol ("X" or "O") for this player
    */
   public InteractivePlayer(String s ) {
       super(s); //passes symbol to parent class constructor
       scan = new Scanner(System.in);
   }
   
   /**
    * Constructor that lets existing Scanner in
    * @param s The String symbol ("X" or "O") for this player
    * @param sc The existing Scanner object thats use for input
    */
   public InteractivePlayer(String s, Scanner sc) {
       super(s);
       scan = sc;
   }
   
   /**
    * @return Scanner put on this player
    */
   public Scanner getScan() {
       return scan;
   }
}
