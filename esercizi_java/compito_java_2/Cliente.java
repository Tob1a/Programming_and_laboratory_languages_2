import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String name;
    private int cod;
    private List<Servizio> servizio;
    private String codicedipendente = null;

    public Cliente(int cod, String name) {
        this.cod = cod;
        this.name = name;
        this.servizio = new LinkedList<Servizio>();
    }

    public void addServizio(Dipendente d, double ore) {
        servizio.add(new Servizio(d, ore));
    }

    public double getCosto1() {
        double cost = 0;
        for (Servizio s : servizio)
            cost = cost + s.getCosto2();
        return cost;
    }

    public int getMaximo() {
        int max = 0, dipendente = 0, volte = 0;

        for (Servizio s : servizio) {
            dipendente = s.d.cod;
            for (Servizio s2 : servizio) {
                if (dipendente == s.d.cod)
                    volte++;
            }
            if (max <= volte) {
                max = volte;
                codicedipendente = s.d.name;
            }
            volte = 0;
        }
        return max;
    }

    public String getName() {
        return codicedipendente;
    }

    public String toString() {
        return cod + "\t" + name + "\t" + getCosto1();
    }
}
