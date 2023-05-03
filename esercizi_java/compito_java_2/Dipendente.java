public class Dipendente {
    protected int cod;
    protected String name;
    protected double cost;

    public Dipendente(int cod, String name, double cost) {
        this.cod = cod;
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return name + "\t" + cod + "\t";
    }
}