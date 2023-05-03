 package palestra;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private int cod;
    private String nome;
    private List<Servizi> servizio;
    
    public Cliente(int cod, String nome){
        this.cod=cod;
        this.nome=nome;
        this.servizio = new LinkedList<Servizi>(); 
    }
    
    public void addServizio(Dipendente d, double ore){
        servizio.add(new Servizi(d,ore));
    }
    
    public double getcost(){
        double c=0;
        
        for(Servizi s: servizio){
            c=s.ore*s.d.cost+c;
        }
        
        return c;
    }
    
    public int numServ(int codice){
        int a=0;
        
        for(Servizi s: servizio){
            if(codice==s.d.cod){
                a=a+1;
            }
        }
        return a;
    }
    
    public String toString(){
        return cod + "\t"+ nome+ "\t"+getcost();
    }
}
