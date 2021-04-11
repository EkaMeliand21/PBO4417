package transportasi;

public class Mobil {
    private String Warna = "Hitam";
    private String Nopol = "G 1 B";
    private int TahunProduksi;
    private boolean Rem = false;

    public Mobil() {

    }
    public Mobil(String Warna, String Nopol, int TahunProduksi,boolean Rem) {
        this.Warna = Warna;
        this.Nopol = Nopol;
        this.TahunProduksi = TahunProduksi;
        this.Rem = Rem;
    }
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public String getWarna() {
        return this.Warna;
    }
    public void setNopol(String Nopol) {
        this.Nopol = Nopol;
    }
    public String getNopol() {
        return this.Nopol;
    }
    public void setTahunProduksi(int TahunProduksi) {
        this.TahunProduksi = TahunProduksi;
    }
    public int getTahunProduksi() {
        return this.TahunProduksi;
    }
    public void setRem(boolean Rem){
        this.Rem = Rem;
    }
    public boolean getRem(){
        return this.Rem;
    }
}