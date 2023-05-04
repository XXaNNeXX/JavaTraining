import javax.swing.JOptionPane;

public class Gebrauchtwagen {
    public static void main(String[] args) {
        Fahrzeug BMW = new Fahrzeug(50000.99, "BMW X1", 2010, 1000);
        System.out.println("Alter Preis: " + BMW.getPreis());
        System.out.println("Model: " + BMW.getModell());
        System.out.println("Baujahr: " + BMW.getBaujahr());
        System.out.println("Kilometerstand: " + BMW.getKilometer());

        int a = JOptionPane.showConfirmDialog(null, "Möchten Sie den Preis ändern?");
        if(a == 0) {
            String b = JOptionPane.showInputDialog("Neuer Preis:");
            double n = Double.parseDouble(b);
            BMW.setPreis(n);
            System.out.println("Neuer Preis: " + BMW.getPreis());
        }
        if(a == 2) {
            System.out.println("Abbruch");
        }
    }
}