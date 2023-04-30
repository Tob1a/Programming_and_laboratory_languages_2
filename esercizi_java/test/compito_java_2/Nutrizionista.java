public class Nutrizionista extends Dipendente {
    private long telefono;
    private int appuntamenti;
    private boolean medico;

    public Nutrizionista(int cod, String name, double cost, long telefono, boolean medico,
            int appuntamenti) {
        super(cod, name, cost);
        this.telefono = telefono;
        this.medico = medico;
        this.appuntamenti = appuntamenti;
    }

    @Override
    public String toString() {
        return super.toString() + "nutri\t-\t-\t" + telefono + "\t" + medico + "\t" + appuntamenti + "\t"
                + super.cost;
    }
}
