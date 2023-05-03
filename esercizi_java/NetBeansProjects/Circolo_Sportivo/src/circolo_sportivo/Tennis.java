package circolo_sportivo;

/**
 *
 * @author tobiasacchetto
 */
public class Tennis extends Campo{
    private String terreno;
    private float temperatura;
    
    public Tennis(int cod,String nome,float larghezza, float lunghezza, float costorario, float temperatura, String terreno){
        super(cod,nome,larghezza,lunghezza,costorario);
        this.temperatura= temperatura;
        this.terreno=terreno;
    }
    
    public String toString(){
        return "tennis\t"+super.toString()+temperatura+"\t"+terreno+"\t-\t-\t"+super.costorario;
    }
    
}
