package perlombaan;

public interface LombaSurat {
    public interface LombaSurat {
        double bobotStruktur = 0.10;
        double bobotIsi =  0.40;
        double bobotKreativitas = 0.30;
        double bobotkaidah = 0.20;

        public void setNilaiSurat(double n1, double n2, double n3, double n4);
        public double getNilaiSurat();
    }
}
