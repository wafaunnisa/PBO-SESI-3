package segitiga;

public class segitigasiku extends segitiga {
    public segitigasiku(double alas, double tinggi, double sisi ) {
        super.setName("segitiga siku siku");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(sisi);
    }
    public void hitungLuas(double alas, double tinggi) {
        super.luas = 0.5 * alas * tinggi;

    }

    public void hitungKeliling(double sisi) {
        super.keliling =  sisi + sisi + sisi;
    }
    
}