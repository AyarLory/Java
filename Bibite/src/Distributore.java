/* Abbiamo bisogno di 5 metodi:
1) inserisciGettone: Che ci permette di inserire il gettone nel distributore
2) erogaLattina: Che rimuove una lattina dal distributore
3) inserisciLattina: Che inserisce una lattina nel distributore
4) getLattine: Che ci dice il numero di lattine all'interno del distributore
5) getGettoni: Che ci dice il numero di gettoni all'interno del distributore
*/

//Iniziamo con il creare la classe Distributore con tutti i vari metodi
public class Distributore{
    private int numeroLattine;
    private int numeroGettoni;

        public void inserisciGettone(){
            numeroGettoni++;
        }

        public void aggiungiLattina(){
            numeroLattine++;
        }

        public void erogaLattina(){
            if(numeroGettoni >= 1 && numeroLattine >= 1) {
                numeroLattine--;
                numeroGettoni--;
                System.out.println("Lattina erogata!");
            }
            else System.out.println("Impossibile erogare, numero di gettoni o lattine: insufficiente");
        }
        public int getLattine(){
            return numeroLattine;
        }

        public int getGettoni(){
            return numeroGettoni;
        }

    //Inizio del main
    public static void main(String[] args){
            Distributore distributore = new Distributore();

            //Aggiungo 5 lattine
            for(int i=0;i<5;i++){
                distributore.aggiungiLattina();
            }
            //Aggiungo 3 gettoni
            for(int i=0;i<3;i++){
                distributore.inserisciGettone();
            }
            //Erogazione 1
            distributore.erogaLattina();

            //Check di gettoni e lattine
            System.out.println("Al momento ci sono: "+distributore.getLattine()+" lattine e "+distributore.getGettoni()+" gettoni");

            //Faccio altre 2 erogazioni con check alla fine
            distributore.erogaLattina();
            distributore.erogaLattina();

            System.out.println("Al momento ci sono: "+distributore.getLattine()+" lattine e "+distributore.getGettoni()+" gettoni");

            //Provo a fare una ulteriore erogazione, i gettoni dovrebbero essere finiti
            distributore.erogaLattina();
    }


}

