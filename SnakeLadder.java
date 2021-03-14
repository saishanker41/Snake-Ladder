public class SnakeLadder {

   public static final int startPosition = 0;
	public static void main(String[] args) {
      int dieRoll;
      int playerPosition = startPosition;
		dieRoll = (int)(Math.random()*6) + 1;
      playerPosition += dieRoll;
      System.out.println("The die comes up " + dieRoll);

      System.out.println("Player position is: " + playerPosition);

	}
}
