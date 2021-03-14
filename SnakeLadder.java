public class SnakeLadder {

   public static final int startPosition = 0;
   public static final int winningPosition = 100;
	public static void main(String[] args) {
      int dieRoll;
      int currentPosition = 0;
      int playerPosition = startPosition;
		dieRoll = (int)(Math.random()*6) + 1;
      //int option = (int)(Math.random()*3);

      //System.out.println("The die comes up " + dieRoll);
      while (playerPosition != winningPosition)
      {
          System.out.println("The die comes up " + dieRoll);
          currentPosition = playerPosition;
          int option = (int)(Math.random()*3);
          if(option==0)
          {
             System.out.println("No Play");
             playerPosition = currentPosition;


          }
          else if(option==1)
          {
             System.out.println("Got Ladder");
             playerPosition += dieRoll;
             if(playerPosition > 100)
             {
                   playerPosition = currentPosition;
             }

          }
          else if(option==2)
          {
             System.out.println("Snake attacked");
             playerPosition -= dieRoll;
             if(playerPosition <= 1)
             {
                   playerPosition = 1;
             }

          }
          System.out.println("New Player position is: " + playerPosition);
      }
	}
}
