package gestione;

/**
 *
 * @author tobiasacchetto
 */
public class furgone extends veicolo{
    private int posti;
    private String categoria;
    private boolean vano;
    
    public furgone(int cod, String targa, String modello, String marca, double cost, String categoria, int posti, boolean vano){
        super(cod,targa,modello,marca,cost);
        this.posti=posti;
        this.categoria=categoria;
        this.vano=vano;
    }
    @Override
    public String toString(){
        return "commericiale"+"\t"+super.toString()+"\t-"+"\t-"+"\t"+categoria+"\t"+posti+"\t"+vano;
    }
}
