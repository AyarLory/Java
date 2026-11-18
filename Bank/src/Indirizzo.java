// classe immutabile
public class Indirizzo implements Cloneable{
    private final String via;
    private final int civico;
    private final String citta;
    private final int cap;

    // costruttore
    public Indirizzo(String via, int civico, String citta, int cap){
        this.via = via;
        this.civico = civico;
        this.citta = citta;
        this.cap = cap;
    }

    // override toString
    @Override
    public String toString(){
        return "Via/Piazza: " + via + ", " + civico + ", " + citta + ", " + cap;
    }

    // override del metodo equals
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; // se i due oggetti confrontati hanno lo stesso indirizzo di memoria, allora sono lo stesso oggetto

        if(obj == null || getClass() != obj.getClass()) return false; // se l'oggetto esplicito e' nullo oppure i due oggetti confrontati sono di classi differenti allora sono due oggetti diversi

        Indirizzo other = (Indirizzo) obj; // casting e assegnazione ad un nuovo oggetto di tipo Indirizzo

        return this.via.equals(other.via) && this.civico == other.civico && this.citta.equals(other.citta) && this.cap == other.cap; // ritorno il risultato dei confronti tra le quattro variabili d'istanza dei due oggetti, se tutte e quattro sono uguali allora sono lo stesso oggetto, altrimenti no
    }

    // override clone
    @Override
    public Indirizzo clone(){
        try{
            return (Indirizzo) super.clone(); // prova a fare la copia superficiale dell'oggetto (utilizzando il metodo clone della classe super, ovvero Object in questo caso)
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError("Impossibile clonare indirizzo"); // se la copia superficiale non va a buon fine, allora lancia questa eccezione (ma non smettere di eseguire il programma [uso di catch])
        }
    }
}