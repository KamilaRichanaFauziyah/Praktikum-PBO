public class PersegiPanjang implements BangunDatar{
    private double panjang, lebar;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }

    public void setPanjang(int p){
        panjang = p;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setLebar(int l){
        lebar = l;
    }

    public double getLebar(){
        return lebar;
    }

    @Override
    public double Luas() {
        return panjang * lebar;
    }

    @Override
    public double Keliling() {
        return 2 *(panjang + lebar);
    }
}
