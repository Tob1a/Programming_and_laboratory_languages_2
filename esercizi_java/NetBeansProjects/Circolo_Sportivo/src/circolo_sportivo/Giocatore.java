package circolo_sportivo;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author tobiasacchetto
 */
public class Giocatore {
    protected int cod,eta,categoria;
    protected String nome;
    protected List<Prenotazioni> prenotazione;
    public Giocatore(int cod, String nome, int eta, int categoria){
        this.cod=cod;
        this.categoria=categoria;
        this.nome=nome;
        this.eta=eta;
        this.prenotazione = new LinkedList<Prenotazioni>();
    }
    
    public void addPrenotazione(Campo c, int orainiz){
        prenotazione.add(new Prenotazioni(c,orainiz));
    }
    
    public float volte(int b){
        float a=0;
        for(Prenotazioni p: prenotazione){
            if(b==p.c.cod){
                a=p.c.costorario+a;
            }
        }
        return a;
    }
    
    @Override
    public String toString(){
        return cod+"\t"+nome+"\t"+eta+"\t"+categoria+"\t"+prenotazione.toString()+"";
    }
}
