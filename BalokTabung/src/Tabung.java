
public class Tabung extends Lingkaran implements BangunRuang{

    private double tinggi;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return phi * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double LuasP() {
        return 2 * (BangunDatar.phi * super.getJari()) * (super.getJari() + tinggi);
    }

}
