package circolo_sportivo;

/**
 *
 * @author tobiasacchetto
 */
public class Prenotazioni {
    protected Campo c;
    protected int orelez;
    
    public Prenotazioni(Campo c, int orelez){
    this.c=c;
    this.orelez=orelez;
}
    
    public String toString(){
        return "('"+c.cod+","+orelez+"')";
    }
    public int toCod(){
        return c.cod;
    }
    
}
