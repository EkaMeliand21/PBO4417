public class TestGame {
      public static void main(String[] args){
            // GamePlayer player1 = new GamePlayer();
            // player1.setDimension(10, 20);
            // player1.setPosition(100, 100);
            // System.out.println("Player 1 Width :"+player1.getWidth());
            // System.out.println("Player 1 Height :"+player1.getHeight());
            // System.out.println("Player 1 X :"+player1.getX());
            // System.out.println("Player 1 Y :"+player1.getY()+"\n");
            // player1.Run();
            // player1.Run(30);

            // GamePlayer player2 = new GamePlayer(20,30,120,160);
            // System.out.println("\nPlayer 2 Width :"+player2.getWidth());
            // System.out.println("Player 2 Height :"+player2.getHeight());
            // System.out.println("Player 2 X :"+player2.getX());
            // System.out.println("Player 2 Y :"+player2.getY()+"\n");
            // player2.Run();
            // player2.Run(60);

            // GameEnemy enemy1 = new GameEnemy();
            // enemy1.setDimension(10, 20);
            // enemy1.setPosition(120, 140);
            // System.out.println("\nEnemy 1 Width :"+enemy1.getWidth());
            // System.out.println("Enemy 1 Height :"+enemy1.getHeight());
            // System.out.println("Enemy  X :"+enemy1.getX());
            // System.out.println("Enemy  Y :"+enemy1.getY()+"\n");
            // enemy1.Run();

            // GameEnemy enemy2 = new GameEnemy(20,40,100,120);
            // System.out.println("\nEnemy 2 Width :"+enemy2.getWidth());
            // System.out.println("Enemy 2 Height :"+enemy2.getHeight());
            // System.out.println("Enemy  X :"+enemy2.getX());
            // System.out.println("Enemy  Y :"+enemy2.getY()+"\n");
            // enemy2.Run();

            GamePlayer hero = new GamePlayer();
            hero.setDimension(12, 12);
            hero.setPosition(10, 220);
            System.out.println("Posisi Player :"+hero.getX()+","+hero.getY());
            hero.Run(12);
            System.out.println("Posisi Player :"+hero.getX()+","+hero.getY());
            GamePlayer hero2 = new GamePlayer();
            hero2.setDimension(12, 32);
            hero2.setPosition(10, 10);

            GameEnemy monster = new GameEnemy();
            monster.setDimension(12, 32);
            monster.setPosition(10, 10);

            GameEnvironment scene = new GameEnvironment();
            scene.addPlayer(hero);
            scene.addPlayer(hero);
            scene.addPlayer(hero2);
            scene.getAllPlayers();
            scene.getAllEnemies();
            scene.removePlayer(hero);
            scene.getAllPlayers();
            scene.addEnemy(monster);
            scene.Interaction();
      }
}


