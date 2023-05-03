package universita;

/**
 *
 * @author tobiasacchetto
 */

public class Laboratorio extends Corso{
    private String nomelab,nomeass;
    private int numpos;
    
    public Laboratorio(int cod,String nomecorso,String nomedoc,String nomelab,String nomeass,int numpos){
        super(cod,nomecorso,nomedoc);
        this.nomelab=nomelab;
        this.nomeass=nomeass;
        this.numpos=numpos;
    }
    
    @Override
    public String toString(){
        return super.toString()+"lab.\t-\t-\t-\t"+nomelab+"\t"+nomeass+"\t"+numpos;
    }
}
