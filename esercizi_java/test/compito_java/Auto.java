public class Auto extends Veicolo {
    private int cilindrata;
    private double capienza;

    public Auto(int codice, String targa, String modello, String marca, double costo, int cilindrata, double capienza) {
        super(codice, targa, modello, marca, costo);
        this.cilindrata = cilindrata;
        this.capienza = capienza;
    }

    @Override
    public String toString() {
        return "automobile\t" + super.toString() + "\t-\t" + "-\t" + cilindrata + "\t" + capienza;
    }
}
