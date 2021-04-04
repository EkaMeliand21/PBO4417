import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Boneka boneka= new Boneka();
            System.out.println(boneka.sisaBoneka());
 
            boneka.tambahBoneka("Barbie");
            boneka.tambahBoneka("Hello Kitty");
            boneka.tambahBoneka("Panda");
            System.out.println(boneka.sisaBoneka());
 
            boneka.gantiBoneka(2,"Winnie The Pooh");
            System.out.println(boneka.sisaBoneka());
 
            boneka.bonekaRusak();
            System.out.println(boneka.sisaBoneka());
      }
}
 
class Istana_Boneka {
      Stack<String> doll = new Stack<String>();
 
      public Istana_Boneka(){
 
      }
      public void setBoneka(Stack<String> doll) {
            this.doll = doll;
      }
      public Stack<String> getBoneka(){
            return this.doll;
      }
} 
 
class Boneka extends Istana_Boneka {
      public void tambahBoneka(String doll){
            super.getBoneka().push(doll);
      }
      public String bonekaRusak(){
            return super.getBoneka().pop();
      }
      public void gantiBoneka(int index,String doll){
            super.getBoneka().set(index, doll);
      }
      public Stack<String> sisaBoneka(){
            return super.getBoneka();
      }
}

