package gestione;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author tobiasacchetto
 */
public class cliente {
    protected String nome,cognome;
    protected List<Noleggio> veicolo;
    
    public cliente(String nome,String cognome) {
    this.nome = nome;
    this.cognome = cognome;
    this.veicolo = new LinkedList<Noleggio>();
    }
    
    
    public void addVeic(veicolo v, int giorni){
    veicolo.add(new Noleggio(v, giorni));
    }
    
    
    
    public double getmassimo(int numero){
    double massimo = 0;
    int variabile=0;
    for (Noleggio n : veicolo){
        variabile = n.codice;
        if(variabile == numero)
        {
            massimo = massimo+n.v.cost*n.n;
        }}
    return massimo;
    }
    
    public double costonoleggio(){
    double costo=0;
    for (Noleggio n : veicolo)
        costo= n.v.cost * n.n+ costo;
    
    return costo;
    }
    
    public String toString(){
        return nome + "\t"+ cognome +"\t" +costonoleggio()+"\t["+ veicolo.toString()+"]";
    }
    
}
