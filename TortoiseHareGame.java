//Simple game taking turns
import java.util.Scanner;
import java.util.Random;
public class TortoiseHareGame
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   String playerOneName = "tortoise";
   String playerTwoName = "hare";
   int playerOnePosition = 1;
   int playerTwoPosition = 1;
   
   while(true)
   {
   playerOnePosition = playerOnePosition + rollDice();
   if(playerOnePosition >= 100)
   {
   System.out.println("Player one has Won. At position " + playerOnePosition);
   break;
   }
   System.out.println("Player one is at position " + playerOnePosition);
   if(playerOnePosition == playerTwoPosition)
   {
   System.out.println("Sorry player two, back to position one for you");
   playerTwoPosition = 1;
   System.out.println(" Player two is now at " + playerTwoPosition);
   }
   
   playerTwoPosition = playerTwoPosition + rollDice();
   if(playerTwoPosition >= 100)
   {
   System.out.println("Player two has Won. At position " + playerTwoPosition);
   break;
   }
   System.out.println("Player two is at position " + playerTwoPosition);
   if(playerOnePosition == playerTwoPosition)
   {
   System.out.println("Sorry player one, back to position two for you");
   playerOnePosition = 1;
   System.out.println(" Player one is now at " + playerOnePosition);
   }   
   }
   }
   public static int rollDice()
   {
   Random random = new Random();
   int diceOne = 0;
   int diceTwo = 0;
   int total = 0;
   diceOne = 1 + random.nextInt(6);
   diceTwo = 1 + random.nextInt(6);
   total = diceOne + diceTwo;
   return total;
   }
   }