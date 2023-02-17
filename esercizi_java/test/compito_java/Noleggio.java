public class Noleggio {
    protected Veicolo v;
    protected int n, codice;

    public Noleggio(Veicolo v, int noleggio) {
        this.v = v;
        this.n = noleggio;
        this.codice = v.getCod();

    }

    public Veicolo getVeicolo() {
        return v;
    }

    public int getNoleggio() {
        return n;
    }

    public int getCodice() {
        return codice;
    }

    public double getCost() {
        return v.cost;
    }

    public String toString() {
        return "(" + v.getTarga() + "," + n + ")";
    }
}