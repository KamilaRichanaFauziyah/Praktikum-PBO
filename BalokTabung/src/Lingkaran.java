public class Lingkaran implements BangunDatar{
    private double jari, hasilLuas, hasilKel;

    public Lingkaran(double r){

        jari = r;
    }

    // Encaptulation
    public void setJari(int r){
        jari = r;
    }

    public double getJari(){
        return jari;
    }

    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double Luas() {
        hasilLuas = phi * (jari * jari);
        return hasilLuas;
    }
    @Override
    public double Keliling() {
        return hasilKel = phi * (2*jari);
    }
}
