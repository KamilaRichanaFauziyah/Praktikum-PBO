package perlombaan;
    public interface LombaSurat {
        double nilaiiStruktur = 0.10;
        double nilaiiIsi =  0.40;
        double nilaiiKreativitas = 0.30;
        double nilaiibahasa = 0.20;

        public void setNilaiSurat(double nilai1, double nilai2, double nilai3, double nilai4);
        public double getNilaiSurat();
    }

