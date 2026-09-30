import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // TEST DELLA CLASSE PUNTO

        System.out.println("===== TEST PUNTO =====");

        Punto p = new Punto();

        System.out.print("Inserisci coordinata x: ");
        float x = scan.nextFloat();
        p.setX(x);

        System.out.print("Inserisci coordinata y: ");
        float y = scan.nextFloat();
        p.setY(y);

        System.out.println();
        System.out.println("Coordinate del punto:");
        System.out.println("X = " + p.getX());
        System.out.println("Y = " + p.getY());

        p.stampaPunto();


        // TEST DELLA CLASSE RETTANGOLO

        System.out.println();
        System.out.println("===== TEST RETTANGOLO =====");

        System.out.print("Inserisci la larghezza del rettangolo: ");
        float larghezza = scan.nextFloat();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        float altezza = scan.nextFloat();

        Rettangolo r = new Rettangolo(p, larghezza, altezza);

        System.out.println();
        r.stampaRettangolo();


        // MODIFICA DEL PUNTO

        System.out.println();
        System.out.println("===== MODIFICA PUNTO =====");

        System.out.print("Inserisci la nuova coordinata x: ");
        float nuovaX = scan.nextFloat();
        p.setX(nuovaX);

        System.out.print("Inserisci la nuova coordinata y: ");
        float nuovaY = scan.nextFloat();
        p.setY(nuovaY);

        System.out.println();
        System.out.println("Nuovo punto del rettangolo:");
        r.stampaRettangolo();

        scan.close();
    }
}
