import java.util.List;
import java.util.LinkedList;

public class Cliente {
    private String nome;
    private String cognome;
    private List<Noleggio> veicolo;

    public Cliente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.veicolo = new LinkedList<Noleggio>();
    }


    public void addVeic(Veicolo v, int giorni) {
        veicolo.add(new Noleggio(v, giorni));
    }

    public double getTotal() {
        double total = 0;
        for (Noleggio i : veicolo) {
            total = i.getNoleggio() * i.getCost() + total;
        }
        return total;
    }

    public double getMassimoveicolo(int num) {
        double massimo = 0;
        int ciaonenenen = 0;
        for (Noleggio n : veicolo) {
            ciaonenenen = n.getCodice();
            if (ciaonenenen == num) {
                massimo = n.getNoleggio() * n.getCost() + massimo;
            }
        }
        return massimo;
    }

    public String toString() {
        return nome + "\t" + cognome + "\t" + getTotal() + "\t{" + veicolo.toString() + "}";
    }

}