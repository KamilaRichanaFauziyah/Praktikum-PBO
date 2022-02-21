import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celcius;
        int pilih;
        Scanner input = new Scanner(System.in);

        System.out.print(
                "----------------------------\n" +
                        "| PROGRAM KONVERSI SUHU AIR |\n" +
                        "----------------------------\n" +
                        " Input Data\n" +
                        "-----------\n" +
                        "Suhu Dalam Celcius : "
        );
        celcius = input.nextDouble();
        while (true) {
            System.out.print(
                "\n\nOpsi\n " +
                "1. Lihat Data Konversi \n " +
                "2. Edit Data Konversi\n " +
                "3. Exit\n" +
                "Pilih :  "
            );
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Konversi convert = new Konversi(celcius);
                    System.out.print(
                                    "\nSuhu Dalam Celcius : " + celcius +
                                    "\nDalam Fahrenhait : " + convert.toFahrenhait() +
                                    "\nDalam Reamur     : " + convert.toReamur() +
                                    "\nDalam Kelvin     : " + convert.toKelvin() +
                                    "\nKondisi Air " + convert.kondisiAir()
                    );
                    break;
                case 2:
                    System.out.print(
                            "\n\nInput Data\n" +
                            "-----------\n" +
                            "Suhu Dalam Celcius : "
                    );
                    celcius = input.nextDouble();
                    break;

                case 3:
                    return;
                default:
            }
        }
    }
}