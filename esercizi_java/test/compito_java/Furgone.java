public class Furgone extends Veicolo {
    private int m;

    public Furgone(int cod, String targa, String modello, String marca, String categoria, int posti, boolean vano) {
        super(cod, targa, modello, marca, categoria, posti, vano);
        this.m = 0;

    }
}
