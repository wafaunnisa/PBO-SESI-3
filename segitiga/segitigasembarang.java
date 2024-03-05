package segitiga;

public class segitigasembarang extends segitiga {

    public segitigasembarang(double alas, double tinggi, double sisia, double sisib, double sisic){
        super.setName("segitiga sembarang");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(sisia, sisib, sisic);
    }
    public void hitungLuas(double alas, double tinggi) {
        super.luas = 0.5 * alas * tinggi;

    }
    public void hitungKeliling(double sisia, double sisib, double sisic) {
        super.keliling =  sisia + sisib + sisic;

    }



    
}