package universita;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author tobiasacchetto
 */
public class Studente {
    protected int cod;
    protected String nome;
    protected List<Libretto> corso;
    public Studente(int cod,String nome){
        this.cod=cod;
        this.nome=nome;
        this.corso= new LinkedList<Libretto>();
    }
    
    public void addCorso(Corso c,String voto){
        corso.add(new Libretto(c,voto));
    }
    
    public double media(){
        double a=0;
        int z=0;
        for(Libretto l: corso){
            if(l.voto.equals("30L"))
                a=a+31;
            else
                a=Integer.parseInt(l.voto)+a;
            z++;
        }
        a=a/z;
        return a;
    }
    
    public String max(){
        double a=0;
        String nome="";
        for(Libretto l: corso){
            if(l.voto.equals("30L")){
                return l.c.nomecorso+"\t"+l.voto;
            }else
            {
                if(Double.parseDouble(l.voto)>a){
                    a=Double.parseDouble(l.voto);
                    nome=l.c.nomecorso;
                }
            }
        }
        return nome+"\t"+a;
    }
    
    public String toString(){
        return nome+"\t"+media()+"["+corso.toString()+"]";
    }
}
