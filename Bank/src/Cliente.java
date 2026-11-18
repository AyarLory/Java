public class Cliente implements Cloneable{
    private String nome;
    private Indirizzo indirizzo;

    // costruttore
    public Cliente(String nome, Indirizzo indirizzo){
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    // getter per nome cliente
    public String getName(){
        return this.nome;
    }

    // getter per indirizzo
    public Indirizzo getAddress(){
        return this.indirizzo;
    }

    // metodo modificatore per nome cliente
    public void setName(String nome){
        if(!nome.equals(this.nome)) // se il risultato del confronto tra le due stringhe e' false
            this.nome = nome;
    }

    // metodo modificatore per indirizzo cliente
    public void setAddress(Indirizzo indirizzo){
        this.indirizzo = indirizzo;
    }

    // override del metodo equals
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; // se hanno lo stesso indirizzo di memoria allora sono uguali

        if(obj == null || getClass() != obj.getClass()) return false; // se l'oggetto esplicito e' nullo oppure i due oggetti sono di classi differenti allora sono diversi

        Cliente other = (Cliente) obj; // casting

        return this.nome.equals(other.nome) && this.indirizzo.equals(other.indirizzo); // risultato del confronto tra le variabili d'istanza dei due oggetti
    }

    // override metodo clone
    @Override
    public Cliente clone(){
        try{
            return (Cliente) super.clone(); // copia superficiale
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError("Impossibile eseguire clonazione!"); // in caso di errore clonazione
        }
    }
}