package transportasi;

public class Bicycle {
    private String Warna = "Hitam";
    private String Merek;
    private boolean Rem = false;

    public Bicycle() {

    }
    public Bicycle(String Warna, String Merek, boolean Rem) {
        this.Warna = Warna;
        this.Merek = Merek;
        this.Rem = Rem;
    }
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public String getWarna() {
        return this.Warna;
    }
    public void setMerek(String Merek) {
        this.Merek = Merek;
    }
    public String getMerek() {
        return this.Merek;
    }
    public void setRem(boolean Rem){
        this.Rem = Rem;
    }
    public boolean getRem(){
        return this.Rem;
    }
}