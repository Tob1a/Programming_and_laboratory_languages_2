public class Servizio {
    protected Dipendente d;
    protected double ore;

    public Servizio(Dipendente d, double ore) {
        this.d = d;
        this.ore = ore;
    }

    public Double getCosto2() {
        return d.cost * ore;
    }

}
