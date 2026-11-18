import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CatFiles {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Inserire almeno due file e il file di output!");
            return;
        }

        String outputFile = args[args.length - 1];

        try {
            FileOutputStream out = new FileOutputStream(outputFile);

            for (int i = 0; i < args.length - 1; i++) {

                FileInputStream in = new FileInputStream(args[i]);

                int carattere;

                while ((carattere = in.read()) != -1) {
                    out.write(carattere);
                }

                in.close();
            }

            out.close();

            System.out.println("Concatenazione finita!");

        }
        catch (IOException e) {
            System.out.println("Errore durante la gestione dei file: " + e.getMessage());
        }
    }
}
