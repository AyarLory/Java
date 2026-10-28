package q1;
import java.util.Objects;
import java.time.LocalDate;

public class Fattura extends DocumentoDiVendita implements Cloneable {
    private int numProgr;
    private Azienda cliente;
    private Azienda venditore;
    private LocalDate data;

    public Fattura(Azienda venditore, String descrizione, double importo, int numProgr, Azienda cliente, LocalDate data) {
        super(venditore, descrizione, importo);
        this.numProgr = numProgr;
        this.cliente = cliente;
        this.data = data;
    }

    public double getNumProgr() {
        return numProgr;
    }

    public Azienda getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Fattura[Venditore= " + restituisciVenditore() + "Descrizione= " + getDescrizione() + "Importo= " + getImporto() + "Cliente= " + cliente + "Numero Progressivo= " + numProgr + "Data= " + data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Fattura altra = (Fattura) obj;

        return numProgr == altra.numProgr && cliente.equals(altra.cliente) && data.equals(altra.data);
    }

    @Override
    public Fattura clone(){
        return new Fattura(restituisciVenditore().clone(), getDescrizione(), getImporto(), numProgr, cliente, data);
    }
}
