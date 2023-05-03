package gestione;

/**
 *
 * @author tobiasacchetto
 */
public class auto extends veicolo{
    private int cilindrata, bagagliaio;
    
    public auto(int cod,String targa,String modello,String marca,double cost,int cilindrata,int bagagliaio){
        super(cod,targa,modello,marca,cost);
        this.cilindrata = cilindrata;
        this.bagagliaio = bagagliaio;
    }
    
    @Override
    public String toString(){
        return "automobile"+ "\t" + super.toString() +cilindrata + "\t"+ bagagliaio+ "\t-"+ "\t-"+ "\t-";
    }
    
    
}
