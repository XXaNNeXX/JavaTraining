import javax.swing.JOptionPane;
import java.lang.Math;

public class Mathe {

    public static void main(String[] args) {
        String berechnen1 = JOptionPane.showInputDialog("Welche Berechnung möchten Sie durchführen? - 1: Quadratwurzel, 2: Logarithmus, 3: Sinus");
        int berechnen2 = Integer.parseInt(berechnen1);

        if(berechnen2 == 1) {
            String wurzel1 = JOptionPane.showInputDialog("Geben Sie einen Wert für die Wurzelberechnung ein:");
            double wurzel2 = Double.parseDouble(wurzel1);
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + Math.sqrt(wurzel2), "Ergebnis", 1);
        }
        else if(berechnen2 == 2) {
            String loga1 = JOptionPane.showInputDialog("Geben Sie einen Wert für die Logarithmusberechnung ein:");
            double loga2 = Double.parseDouble(loga1);
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + Math.log(loga2), "Ergebnis", 1);
        }
        else if(berechnen2 == 3) {
            String sinus1 = JOptionPane.showInputDialog("Geben Sie einen Wert für die Sinusberechnung ein:");
            double sinus2 = Double.parseDouble(sinus1);
            JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + Math.sin(sinus2), "Ergebnis", 1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Falsche Eingabe", "Fehler", 0);
        }
    }
}