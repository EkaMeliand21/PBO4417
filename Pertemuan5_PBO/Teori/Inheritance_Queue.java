import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Makanan makanan = new Makanan();
            System.out.println(makanan.sisaMakanan());
 
            makanan.tambahMakanan("Ayam");
            makanan.tambahMakanan("Pempek");
            makanan.tambahMakanan("Nasi Padang");
            makanan.tambahMakanan("Daging");
            makanan.tambahMakanan("Sayur Asem");
            System.out.println(makanan.sisaMakanan());
 
            makanan.makananBusuk(3);
            System.out.println(makanan.sisaMakanan());
      }      
}

class Toko_Makanan {
      Queue<String> vegetable = new LinkedList<String>();
 
      public Toko_Makanan(){
 
      }
      public void setMakanan(Queue<String> vegetable) {
            this.vegetable = vegetable;
      }
      public Queue<String> getMakanan(){
            return this.vegetable;
      }
}

class Makanan extends Toko_Makanan {
      public void tambahMakanan(String vegetable){
            super.getMakanan().add(vegetable);
      }
      public void makananBusuk(int index){
            System.out.println(super.getMakanan().poll());
      }
      public Queue<String> sisaMakanan(){
            return super.getMakanan();
      }
} 