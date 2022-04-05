public class PesertaLomba implements LombaSurat, LombaAnimasi{
    String nama, asalSekolah;
    int kategori;
    double nilai1, nilai2, nilai3, nilai4, nilaiAkhir;

    public PesertaLomba(String nama, String asal, int kategori){
        this.nama = nama;
        this.asalSekolah = asal;
        this.kategori = kategori;
    }

    @Override
    public void setNilaiAnimasi(double n1, double n2, double n3, double n4){
        this.nilaiAkhir = n1*bobotAlur + n2*bobotKonten + n3*bobotKreatif + n4*bobotsinema;
    }

    @Override
    public double getNilaiAnimasi(){
        return nilaiAkhir;
    }

    @Override
    public void setNilaiSurat(double n1, double n2, double n3, double n4){
        this.nilaiAkhir = n1*bobotStruktur + n2*bobotIsi + n3*bobotKreativitas + n4*bobotkaidah;
    }

    @Override
    public double getNilaiSurat(){
        return nilaiAkhir;
    }
}
