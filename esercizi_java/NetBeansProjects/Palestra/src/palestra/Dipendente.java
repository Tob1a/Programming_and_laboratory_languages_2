package palestra;


public abstract class Dipendente {
    protected int cod;
    protected String nome;
    protected Double cost;
    
    public Dipendente(int cod, String nome, double cost){
        this.cod = cod;
        this.nome = nome;
        this.cost = cost;
    }
    

    
    public String toString(){
        return nome+ "\t"+cod;
    }
}
