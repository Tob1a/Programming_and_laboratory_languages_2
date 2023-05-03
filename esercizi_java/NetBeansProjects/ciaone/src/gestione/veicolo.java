
package gestione;

/**
 *
 * @author tobiasacchetto
 */
public abstract class veicolo {
    protected int cod;
    protected String targa, modello, marca;
    protected double cost;
    
    
    public veicolo(int cod, String targa, String modello, String marca, double cost){
    this.cod = cod;
    this.targa = targa;
    this.modello = modello;
    this.marca = marca;
    this.cost = cost;
    }
    
    
    @Override
    public String toString(){
    return targa + "\t" + cod + "\t"+ modello + "\t" + marca+"\t" + cost+ "\t";
    }
    
}
