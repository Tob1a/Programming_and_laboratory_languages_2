package universita;

/**
 *
 * @author tobiasacchetto
 */
public class Teoria extends Corso{
    
    private int codaula, oreset;
    private double orelab;
    
    public Teoria(int cod,String nomecorso,String nomedoc,int codaula,int oreset,double orelab){
        super(cod,nomecorso,nomedoc);
        this.codaula=codaula;
        this.orelab = orelab;
        this.oreset = oreset;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\tteoria\t"+codaula+"\t"+oreset+"\t"+orelab;
    }
}
