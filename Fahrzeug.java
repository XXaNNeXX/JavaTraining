public class Fahrzeug {
    private double preis;
    private String modell;
    private int baujahr;
    private int kilometer;

    public Fahrzeug (double wert1, String wert2, int wert3, int wert4) {
        this.preis = wert1;
        this.modell = wert2;
        this.baujahr = wert3;
        this.kilometer = wert4;
    }

    public double getPreis() {
        return preis;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setPreis(double neu) {
        this.preis = neu;
    }
}