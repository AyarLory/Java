package q1;
import javax.print.Doc;
import java.util.Objects;
public class DocumentoDiVendita implements Cloneable{
    private Azienda venditore;
    private String descrizione;
    private double importo;

    public DocumentoDiVendita(Azienda venditore, String descrizione, double importo) {
        this.venditore = venditore;
        this.descrizione = descrizione;
        this.importo = importo;
    }

    //Metodi di Accesso
    public Azienda restituisciVenditore() {
        return venditore;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getImporto() {
        return importo;
    }

    //Metodi Modificatori
    public void aggiornaVenditore(Azienda venditore) {
        this.venditore = venditore;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "Documento di Vendita[Venditore= " + venditore + "Descrizione= " + descrizione + "Importo= " + importo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return false;
        if (getClass() != obj.getClass()) return false;

        DocumentoDiVendita altro = (DocumentoDiVendita) obj;

        return Double.compare(importo, altro.importo) == 0 && venditore.equals(altro.venditore) && descrizione.equals(altro.descrizione);
    }

    @Override
    public DocumentoDiVendita clone(){
        return new DocumentoDiVendita(venditore.clone(), descrizione, importo);
    }
}
