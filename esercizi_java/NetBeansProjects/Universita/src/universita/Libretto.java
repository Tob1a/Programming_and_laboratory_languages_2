package universita;

/**
 *
 * @author tobiasacchetto
 */
public class Libretto {
    protected Corso c;
    protected int cod;
    protected String voto;
    
    public Libretto(Corso c, String voto){
        this.c=c;
        this.voto=voto;
    }
    
    @Override
    public String toString(){
        return "("+c.cod+","+voto+")";
    }
    
}
