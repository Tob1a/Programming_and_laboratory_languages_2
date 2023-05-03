package palestra;

/**
 *
 * @author tobiasacchetto
 */
public class Nutrizionista extends Dipendente{
    int appuntamenti;
    boolean medico;
    long telefono;
    
    public Nutrizionista(int cod, String nome, double cost, long telefono, boolean medico, int appuntamenti){
        super(cod,nome,cost);
        this.telefono=telefono;
        this.medico= medico;
        this.appuntamenti = appuntamenti;
    }
    
    public String toString(){
        return super.toString()+"\tnutri"+"\t-\t-\t"+telefono+"\t"+medico+"\t"+appuntamenti+"\t"+super.cost;
    }
}
