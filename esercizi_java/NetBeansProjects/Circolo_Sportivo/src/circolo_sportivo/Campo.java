package circolo_sportivo;

/**
 *
 * @author tobiasacchetto
 */
public class Campo {
    protected int cod;
    private String nome;
    protected float lunghezza, larghezza, costorario;
    public Campo(int cod,String nome,float larghezza, float lunghezza, float costorario){
        this.cod= cod;
        this.nome=nome;
        this.larghezza= larghezza;
        this.lunghezza = lunghezza;
        this.costorario = costorario;
    }
    
    public String toString(){
        return nome+"\t"+cod+"\t"+larghezza+"\t"+lunghezza+"\t";
    }
}
