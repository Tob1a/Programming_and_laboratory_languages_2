public class Squash extends Campo {
    private float altezza, orario;
    private int piano;

    public Squash(int cod, String name, float lunghezza, float larghezza, float altezza, int piano, float orario) {
        super(cod, name, lunghezza, larghezza);
        this.altezza = altezza;
        this.piano = piano;
        this.orario = orario;
    }
}
