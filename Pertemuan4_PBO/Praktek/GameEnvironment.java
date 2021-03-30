import java.util.ArrayList;

public class GameEnvironment {
      private double width;
      private double height;

      private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
      private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

      public GameEnvironment(){

      }
      public GameEnvironment (double width, double height){
            this.width = width;
            this.height = height;
      }
      public void addPlayer(GamePlayer newPlayer){
            arrPlayer.add(newPlayer);
      }
      public void removePlayer(GamePlayer value){
            arrPlayer.remove(value);
            // arrPlayer.remove(arrPlayer.size() - 1);
      }
      public void getAllPlayers(){
            System.out.println("All of Player: " + arrPlayer);
      }
      public void addEnemy(GameEnemy newEnemy){
            arrEnemy.add(newEnemy);
      }
      public void removeEnemy(GameEnemy value){
            arrEnemy.remove(value);
            // arrEnemy.remove(arrEnemy.size() - 1);
      }
      public void getAllEnemies(){
            System.out.println("All of Enemies: " + arrEnemy);
      }
      public void Interaction (){
            if (arrPlayer == null || arrEnemy == null ){
                  System.out.println("Player or enemy not sets");
            }
            for (int i=0; i<arrPlayer.size();i++){
                 for(int j=0; j<arrEnemy.size();j++){
                       if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                             System.out.println("Player :"+arrPlayer.get(i)+"and Enemy:"+arrEnemy.get(j)+"Not in the same Y position");
                       }
                       if(EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(),arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2){
                             System.out.println("Player :"+arrPlayer.get(i)+"Attacked");
                             System.out.println("Enemy :"+arrEnemy.get(j)+"loses");
                             this.removeEnemy(arrEnemy.get(j));
                       }
                       else{
                             System.out.println("==> Player"+arrPlayer.get(i));
                             arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                             System.out.println("Current x position = "+arrPlayer.get(i).getX()+"<--");
                        }
                 } 
            } 
      }
      public static double EuclideanDistance(int x1,int y1, int x2, int y2){
            return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
      }
}
