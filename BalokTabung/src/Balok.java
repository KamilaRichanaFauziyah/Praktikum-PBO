public class Balok extends PersegiPanjang implements BangunRuang{
    private double tinggi;

    public Balok(double p, double l, double t){
        super(p , l);
        tinggi = t;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double Volume() {
        return super.Luas() * tinggi;
    }

    @Override
    public double LuasP() {
        return 2 * (super.Luas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}