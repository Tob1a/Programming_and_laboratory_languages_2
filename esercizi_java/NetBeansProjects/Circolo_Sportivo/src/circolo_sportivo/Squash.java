package circolo_sportivo;

/**
 *
 * @author tobiasacchetto
 */
public class Squash extends Campo{
    private int piano;
    private float altezza;
    
    public Squash(int cod,String nome,float larghezza, float lunghezza, float costorario, float altezza, int piano){
        super(cod,nome,larghezza,lunghezza,costorario);
        this.altezza=altezza;
        this.piano=piano;
    }
    
    public String toString(){
        return "squash\t"+super.toString()+"-\t-\t"+altezza+"\t"+piano+"\t"+super.costorario;
    }
    
}
