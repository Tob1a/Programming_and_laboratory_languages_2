public class Furgone extends Veicolo {
    private int posti;
    private boolean vano;
    private String categoria;

    public Furgone(int cod, String targa, String modello, String marca, double costo, String categoria, int posti,
            boolean vano) {
        super(cod, targa, modello, marca, costo);
        this.posti = posti;
        this.vano = vano;
        this.categoria = categoria;

    }

    @Override
    public String toString() {
        return "commerciale\t" + super.toString() + "\t-\t" + "-\t" + categoria + "\t" + vano;
    }
}
