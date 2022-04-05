package perlombaan;

public interface LombaAnimasi {
    double nilaiiAlur = 0.15;
    double nilaiiKonten =  0.35;
    double nilaiiKreativ = 0.35;
    double nilaiisinema = 0.15;

    public void setNilaiAnimasi(double nilai1, double nilai2, double nilai3, double nilai4);
    public double getNilaiAnimasi();
}