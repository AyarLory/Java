package q1;
import java.util.Objects;
public final class Indirizzo implements Cloneable{
    private String strada;
    private String civico;
    private String citta;


    public Indirizzo(String strada, String civico, String citta){
        this.strada = strada;
        this.civico = civico;
        this.citta = citta;
    }
    public String getStrada() {
        return strada;
    }

    public String getCivico(){
        return civico;
    }

    public String getCitta(){
        return citta;
    }

    @Override
    public String toString(){
        return "Indirizzo[Strada= " + strada + "Civico= " + civico + "Città= " + citta + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == null) return false;
        if (getClass() != obj.getClass()) return false;

        Indirizzo altro = (Indirizzo) obj;

        return civico == altro.civico && strada.equals(altro.strada) && citta.equals(altro.citta);
    }

    @Override
    public Indirizzo clone() {
        try {
            return (Indirizzo) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    }

