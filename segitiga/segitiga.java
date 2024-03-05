package segitiga;

public class segitiga {
    protected String name;
    protected double luas;
    protected double keliling;

    public double getKeliling(){
        return this.keliling;
    }

    public double getLuas(){
        return this.luas;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public void getInfo() {
        System.out.println("Name :" + this.name);
        System.out.println("Luas :" + this.luas);
        System.out.println("Keliling :" + this.keliling);
        System.out.println("---------------------");
    }
    
    
}