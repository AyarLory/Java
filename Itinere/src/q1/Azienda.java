package q1;
import java.util.Objects;
public class Azienda implements Cloneable{
    private String nome;
    private Indirizzo indirizzo;
    private String numeroTel;


    public Azienda(String nome, Indirizzo indirizzo, String numeroTel){
        this.nome = nome;
        this.indirizzo= indirizzo;
        this.numeroTel=numeroTel;
    }

    public String getNome() {
        return nome;
    }

    public Indirizzo restituisciIndirizzo() {
        return indirizzo;
    }

    public String getnumeroTel() {
        return numeroTel;
    }

    public void aggiornaIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString(){
        return "Azienda[Nome= " + nome + "Indirizzo= " + indirizzo + "Numero Telefono= " + numeroTel + " ]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == null) return false;
        if(getClass() != obj.getClass()) return false;

        Azienda altra = (Azienda) obj;

        return nome.equals(altra.nome) && indirizzo.equals(altra.indirizzo) && numeroTel.equals(altra.numeroTel);
    }

    @Override
    public Azienda clone(){
        return new Azienda(nome, indirizzo.clone(), numeroTel);
    }
}
