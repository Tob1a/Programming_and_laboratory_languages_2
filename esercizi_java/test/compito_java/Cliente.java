public class Noleggio{
    protected Veicolo v;
    protected int noleggio;
    public Noleggio(Veicolo v, int noleggio) {
        this.v = v;
        this.noleggio = noleggio;
    }

    public Veicolo getVeicolo() {
        return v;
    }
    public int getNoleggio() {
        return noleggio;
    }
    public String toString() {
        return  "("+v.getTarga()+","+noleggio+")";
    }
}