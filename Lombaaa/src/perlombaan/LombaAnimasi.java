package perlombaan;

public interface LombaAnimasi {
    double bobotAlur = 0.15;
    double bobotKonten =  0.35;
    double bobotKreatif = 0.35;
    double bobotsinema = 0.15;

    public void setNilaiAnimasi(double n1, double n2, double n3, double n4);
    public double getNilaiAnimasi();
}