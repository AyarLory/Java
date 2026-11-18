import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Keyword{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inserimento nome file
        System.out.print("Inserisci il nome del file: ");
        String nomeFile = scanner.next();

        // Inserimento parola chiave
        System.out.print("Inserisci la parola chiave: ");
        String parola = scanner.next();

        try {

            // Apertura file in lettura
            FileReader reader = new FileReader(nomeFile);
            Scanner in = new Scanner(reader);

            // Apertura file in scrittura
            PrintWriter out = new PrintWriter("risultato.txt");

            // Lettura riga per riga
            while (in.hasNextLine()) {

                String riga = in.nextLine();

                // Controllo presenza parola chiave
                if (riga.contains(parola)) {
                    out.println(riga);
                }
            }

            // Chiusura flussi
            in.close();
            out.close();

            System.out.println("Operazione completata!");

        }
        catch (IOException e) {
            System.out.println("Errore nella gestione dei file: " + e);
        }

        scanner.close();
    }
}
