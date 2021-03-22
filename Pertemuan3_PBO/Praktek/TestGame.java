public class TestGame {
      public static void main(String[] args){
     GamePlayer player1 = new GamePlayer();
     player1.setDimension(10, 20);
     player1.setPosition(100, 100);
     System.out.println("Player 1 Width :"+player1.getWidth());
     System.out.println("Player 1 Height :"+player1.getHeight());
     System.out.println("Player 1 X :"+player1.getX());
     System.out.println("Player 1 Y :"+player1.getY());
     player1.Run();
     player1.Run(20);

     GamePlayer player2 = new GamePlayer(20,20,100,150);
     System.out.println("Player 2 Width :"+player2.getWidth());
     System.out.println("Player 2 Height :"+player2.getHeight());
     System.out.println("Player 2 X :"+player2.getX());
     System.out.println("Player 2 Y :"+player2.getY());
     player2.Run();
     player2.Run(50);

     GameEnemy enemy = new GameEnemy();
     System.out.println("Enemy Width :"+enemy.getWidth());
     System.out.println("Enemy Height :"+enemy.getHeight());
     System.out.println("Enemy X :"+enemy.getX());
     System.out.println("Enemy Y :"+enemy.getY());
     enemy.run();
      }
}
