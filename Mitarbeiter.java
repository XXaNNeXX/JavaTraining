import java.io.*;

public class Mitarbeiter {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Personal MA1 = new Personal("Hannah", "Berger", 30000);
        System.out.println("Vorname " + MA1.getVorname());
        System.out.println("Nachname: " + MA1.getNachname());
        System.out.println("Gehalt: " + MA1.getGehalt());

        String x = br.readLine();
        int y = Integer.parseInt(x);

        MA1.setGehalt(y);
        System.out.println("neues Gehalt: " + MA1.getGehalt());
    }
}