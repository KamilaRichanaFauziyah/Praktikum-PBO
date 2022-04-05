import perlombaan.*;
public class PesertaLomba implements LombaSurat, LombaAnimasi{
    String nama, asalSekolah;
    int kategoriLomba;
    double a, b, c, d , nilaiAkhir;

    public PesertaLomba(String nama, String asal, int kategori){
        this.nama = nama;
        this.asalSekolah = asal;
        this.kategoriLomba = kategori;
    }

    @Override
    public void setNilaiAnimasi(double nilai1, double nilai2, double nilai3, double nilai4){
        this.nilaiAkhir = nilai1*nilaiiAlur + nilai2*nilaiiKonten + nilai3*nilaiiKreativ + nilai4*nilaiisinema;
    }

    @Override
    public double getNilaiAnimasi(){
        return nilaiAkhir;
    }

    @Override
    public void setNilaiSurat(double nilai1, double nilai2, double nilai3, double nilai4){
        this.nilaiAkhir = nilai1*nilaiiStruktur + nilai2*nilaiiIsi + nilai3*nilaiiKreativitas + nilai4*nilaiibahasa;
    }

    @Override
    public double getNilaiSurat(){
        return nilaiAkhir;
    }
}
