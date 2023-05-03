package palestra;


public class Trainer extends Dipendente{
    int ore;
    String specialita;
    
    public Trainer(int cod, String nome,double cost,int ore,String specialita){
        super(cod,nome,cost);
        this.ore = ore;
        this.specialita = specialita;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\ttrainer\t"+ore+"\t"+specialita+"\t"+"-\t-\t-\t"+super.cost;
    }
}
