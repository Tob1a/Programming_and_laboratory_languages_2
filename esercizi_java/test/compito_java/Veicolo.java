public abstract class Veicolo {
    protected int cod;
    protected String targa, modello, marca;
    protected double cost;

    public Veicolo(int c, String t, String mo, String ma, double co) {
        cod = c;
        targa = t;
        modello = mo;
        marca = ma;
        cost = co;
    }

    public int getCod() {
        return cod;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return targa + "\t" + cod + "\t" + modello + "\t" + marca + "\t" + cost;
    }
}