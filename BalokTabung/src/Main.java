import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ulangi;
        do{
            System.out.println("============");
            System.out.println("*Menu Utama*");
            System.out.println("============");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih: ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double p, l, t;
                    System.out.print("Input Panjang: ");
                    p = in.nextInt();
                    System.out.print("Input Lebar: ");
                    l = in.nextInt();
                    System.out.print("Input Tinggi: ");
                    t = in.nextInt();
                    Balok balok = new Balok(p, l, t);

                    System.out.println("Luas Persegi Panjang= " + balok.Luas());
                    System.out.println("Keliling Persegi Panjang= " + balok.Keliling());
                    System.out.println("Volume Balok= " + balok.Volume());
                    System.out.println("Luas Permukaan Balok= " + balok.LuasP());
                    break;
                case 2:
                    double r;
                    System.out.print("Input Tinggi: ");
                    t = in.nextInt();
                    System.out.print("Input Jari - jari: ");
                    r = in.nextInt();
                    Tabung tabung = new Tabung(r, t);

                    System.out.println("Luas Lingkaran= " + tabung.Luas());
                    System.out.println("Keliling Lingkaran= " + tabung.Keliling());
                    System.out.println("Volume Tabung= " + tabung.Volume());
                    System.out.println("Luas Permukaan Tabung= " + tabung.LuasP());
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)= ");
            ulangi = in.nextInt();
        }while(ulangi == 1);
    }
}

