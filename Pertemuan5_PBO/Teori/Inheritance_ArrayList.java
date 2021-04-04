import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           Laptop laptop = new Laptop();
           System.out.println(laptop.sisaLaptop());

           laptop.tambahLaptop("Acer");
           laptop.tambahLaptop("Asus");
           laptop.tambahLaptop("Dell");
           System.out.println(laptop.sisaLaptop());

           laptop.gantiLaptop(1,"HP");
           System.out.println(laptop.sisaLaptop());

           laptop.laptopRusak(0);
           System.out.println(laptop.sisaLaptop());
      }
}

class Toko_Laptop {
      ArrayList<String> fruit = new ArrayList<>();

      public Toko_Laptop(){

      }
      public void setLaptop(ArrayList<String> fruit) {
            this.fruit = fruit;
      }
      public ArrayList<String> getLaptop(){
            return this.fruit;
      }
} 

class Laptop extends Toko_Laptop {
      public void tambahLaptop(String laptops){
            super.getLaptop().add(laptops);
      }
      public String laptopRusak(int index){
            return super.getLaptop().remove(index);
      }
      public void gantiLaptop(int index, String laptops){
            super.getLaptop().set(index, laptops);
      }
      public ArrayList<String> sisaLaptop(){
            return super.getLaptop();
      }
}