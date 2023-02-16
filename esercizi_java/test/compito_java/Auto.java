public class Auto extends Veicolo {
    private int cilindrata;
    private double capienza;

    public Auto(int codice, String targa, String modello, String marca, double costo, int cilindrata, double capienza) {
        super(codice, targa, modello, marca, costo);
        this.cilindrata = cilindrata;
        this.capienza = capienza;
    }

    public String toString() {
        return "automobile" + super.toString() + "-\t" + "-\t" + cilindrata + "\t" + capienza;
    }
}
