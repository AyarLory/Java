package q1;
import java.util.ArrayList;
import java.util.List;

public class ElencoAziende {
    private List<Azienda> aziende;

    public ElencoAziende(){
        aziende = new ArrayList<>();
    }

    public void addAzienda(Azienda azienda){
        aziende.add(azienda);
    }

    public boolean removeAzienda(Azienda azienda){
        return aziende.remove(azienda);
    }

    public boolean getAziende(Azienda azienda){
        return aziende.contains(azienda);
    }

    public int dimensione(){
        return aziende.size();
    }

    public Azienda get(int indice){
        return aziende.get(indice);
    }

    public List<Azienda> restituisciTutte(){
        return new ArrayList<>(aziende);
    }


}
