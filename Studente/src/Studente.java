/*
Esercizio come il precedente rispetto però ad una classe Studente dove siamo interessati a
registrare i voti degli esami di uno studente e recuperare il voto medio.
*/

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Studente {
    private float Voto;
    private int nVoti;
    Scanner scan = new Scanner(System.in);

    public void inserisciVoto() {
        System.out.println("Inserire voto: ");
        Voto = Voto + scan.nextInt();
        nVoti++;
    }

    public void media(){
        System.out.println("La media dei voti inseriti e' uguale a: "+ (Voto/nVoti));
    }
    public static void main(String[] args){
        Studente studente = new Studente();
        studente.inserisciVoto();
        studente.inserisciVoto();
        studente.media();
    }
}
