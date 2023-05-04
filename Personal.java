public class Personal {
    private String vorname;
    private String nachname;
    private int gehalt;

    public Personal (String v, String n, int g) {
        this.vorname = v;
        this.nachname = n;
        this.gehalt = g;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gneu) {
        this.gehalt = gneu;
    }
}