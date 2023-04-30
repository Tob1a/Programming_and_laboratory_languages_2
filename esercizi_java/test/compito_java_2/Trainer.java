public class Trainer extends Dipendente {
    private int ore;
    private String specialita;

    public Trainer(int cod, String name, double cost, int ore, String specialita) {
        super(cod, name, cost);
        this.ore = ore;
        this.specialita = specialita;
    }

    @Override
    public String toString() {
        return super.toString() + "trainer\t" + ore + "\t" + specialita + "\t-\t-\t-\t" + super.cost;
    }
}
