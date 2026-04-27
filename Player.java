
/**
 * Write a description of class Player here.
 * represents the players
 * @author (Sterling)
 * @version (4/23/26)
 */
public class Player
{
   private String symbol;
   
   /**
    * makes player and gives it unique symbol
    * @param symbol The symbol for player
    */
   public Player(String symbol) {
       this.symbol = symbol;  //won't return null
   }
   
   /**
    * @return the players symbol
    */
   public String getSymbol() {
       return symbol;
   }
   
   public int getMove(Board b) {
    // TODO
    return 0;
   }
}
