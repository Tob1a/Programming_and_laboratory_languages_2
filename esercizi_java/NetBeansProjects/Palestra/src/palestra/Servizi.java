package palestra;


public class Servizi {
    protected Dipendente d;
    int cod;
    double ore;
    
    public Servizi(Dipendente d, double ore){
        this.d=d;
        this.cod=d.cod;
        this.ore=ore;
    }
    
   
}
