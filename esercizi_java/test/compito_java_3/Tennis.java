public class Tennis extends Campo {
    private float temperatura, orario;
    private String terreno;

    public Tennis(int cod, String name, float larghezza, float lunghezza, float temperatura, String terreno,
            float orario) {
        super(cod, name, larghezza, lunghezza);
        this.temperatura = temperatura;
        this.terreno = terreno;
        this.orario = orario;

    }
}
