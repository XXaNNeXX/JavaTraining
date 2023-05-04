import java.io.*;

public class Willkommen {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int y;
        boolean weiter = true;

        while(weiter) {
            System.out.println("Zahl zur Quadratberechnung:");
            String x = br.readLine();
            y = Integer.parseInt(x);
            System.out.println("Das Quadrat beträgt " + y*y);
        
            System.out.println("Möchtest du eine weitere Zahl berechnen? 0-ja 1-nein");
            x = br.readLine();
            y = Integer.parseInt(x);

            if(y == 1) {
                weiter = false;
            }
        }
    }
}
