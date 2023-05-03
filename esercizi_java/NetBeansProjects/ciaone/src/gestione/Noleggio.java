package gestione;

/**
 *
 * @author tobiasacchetto
 */
public class Noleggio {
    protected veicolo v;
    protected int n, codice;
    
    public Noleggio(veicolo v,int Noleggio){
    this.v = v;
    n = Noleggio;
    codice = v.cod;
    }
    
    public int returnNoleggio(){
        return n;
    }
    
    public String toString(){
    return "("+v.targa+","+n+")";
    }
    
}
