import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero del mese: ");
        int numeroMese = input.nextInt();
        System.out.println("Inserire l'anno: ");
        int numeroAnno = input.nextInt();

        Year anno = new Year(numeroAnno);
        Mese mese = new Mese(numeroMese, anno);

        System.out.println();
        System.out.println("Mese: " + mese.getMonth());
        System.out.println("Anno: " + anno.getYear());
        System.out.println("Giorni: " + mese.getDays());

        input.close();
    }
}