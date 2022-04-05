import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori, pilihan;
        //String nama, asal;
        double a, b, c, d, nilaiAkhir = 0;

        System.out.println("Lomba Apresiasi Pahlawan Wanita Indonesia Oleh UPNVYK");
        System.out.println("Terdapat 2 kategori perlombaan");
        System.out.println("    1. Animasi (tim)");
        System.out.println("    2. Menulis Surat (Individu)");
        System.out.print("Pilih Kategoti Perlombaan : ");
        kategori = input.nextInt();
        input.nextLine();

        System.out.println("=== Form Pendaftaran ===");
        System.out.print("Input Nama    : ");
        String nama = input.nextLine();
        System.out.print("Asal Sekolah  : ");
        String asal = input.nextLine();

        PesertaLomba peserta =  new PesertaLomba(nama, asal, kategori);

        System.out.println("=== Form Penilaian ===");
        System.out.println("Keterangan : Nilai yang valid berada dintara 0 - 100\n");

        switch (kategori){
            case 1 :
                System.out.print("Input Nilai Alur Cerita: ");
                a = input.nextDouble();
                System.out.print("Input Nilai Konten: ");
                b = input.nextDouble();
                System.out.print("Input Nilai Kreativitas: ");
                c = input.nextDouble();
                System.out.print("Input Nilai Sinematografi: ");
                d = input.nextDouble();
                peserta.setNilaiAnimasi(a, b, c, d);
                nilaiAkhir = peserta.getNilaiAnimasi();
                break;
            case 2 :
                System.out.print("Input Nilai Struktur Surat: ");
                a = input.nextDouble();
                System.out.print("Input Nilai Isi Surat: ");
                b = input.nextDouble();
                System.out.print("Input Nilai Kreativitas: ");
                c = input.nextDouble();
                System.out.print("Input Nilai Penerapan Kaidah Bahasa: ");
                d = input.nextDouble();
                peserta.setNilaiSurat(a, b, c, d);
                nilaiAkhir = peserta.getNilaiSurat();
                break;
        }

        do {
            System.out.println("+++ MENU +++");
            System.out.println("\t1. Tampil");
            System.out.println("\t2. Edit");
            System.out.println("\t3. Exit");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1 :
                    System.out.println("\n   Nilai Akhir : " + nilaiAkhir);
                    System.out.print("***KETERANGAN : ***");
                    if(nilaiAkhir >= 85) System.out.println("Lolos");
                    else System.out.println("Gagal");
                    break;
                case 2 :
                    break;
                case 3 :
                    System.exit(0);
                    break;
            }

        } while (true);
    }
}
