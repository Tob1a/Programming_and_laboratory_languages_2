public class Noleggio {
    protected Veicolo v;
    protected int n;

    public Noleggio(Veicolo v, int noleggio) {
        this.v = v;
        this.n = noleggio;
    }

    public Veicolo getVeicolo() {
        return v;
    }

    public int getNoleggio() {
        return n;
    }

    public String toString() {
        return "(" + v.getTarga() + "," + n + ")";
    }
}