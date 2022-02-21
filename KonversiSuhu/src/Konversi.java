public class Konversi {
    double celcius;

    public Konversi(double celcius) {
        this.celcius = celcius;
    }

    public double toFahrenhait() {
        return ((9 * celcius) / 5 + 32);
    }

    public double toReamur() {
        return ((4 * celcius) / 5);
    }

    public double toKelvin() {
        return (celcius + 273.15);
    }

    public String kondisiAir(){
        if (celcius <= 0) {
            return "Beku";
        } else if (celcius >= 100) {
            return "Mendidih";
        } else {
            return "Normal";
        }
    }
}
