import java.util.LinkedList;
import java.util.List;

public class Giocatore {
    private int cod, eta, categoria;
    private String name;
    private List<Prenotazione> prenotazione;

    public Giocatore(int cod, String name, int eta, int categoria) {
        this.cod = cod;
        this.eta = eta;
        this.name = name;
        this.categoria = categoria;
        this.prenotazione = new LinkedList<Prenotazione>();
    }

    public void addPrenotazione(Campo c, int ora) {
        prenotazione.add(new Prenotazione(c, ora));
    }

}
