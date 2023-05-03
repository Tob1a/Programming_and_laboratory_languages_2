package universita;

/**
 *
 * @author tobiasacchetto
 */
public class Corso {
    protected int cod;
    protected String nomecorso,nomedoc;
    
    
    public Corso(int cod,String nomecorso,String nomedoc){
        this.cod=cod;
        this.nomecorso=nomecorso;
        this.nomedoc=nomedoc;
    }
    
    public String toString(){
        return nomecorso+"\t"+ cod + "\t"+nomedoc+"\t";
    }
}
