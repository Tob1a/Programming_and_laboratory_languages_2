import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gestione {
    static List<Veicolo> veicoli = new LinkedList<Veicolo>();
    static List<Cliente> clienti = new LinkedList<Cliente>();
    static Map<Integer, Veicolo> codProg = new HashMap<Integer, Veicolo>();

    public static void main(String[] args) {
        // punto 1
        try {
            BufferedReader br = new BufferedReader(new FileReader("veicoli.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken(); // delimita automaticamente le stringhe con i delimitatori predefiniti
                                               // che include tutti i parametri spazio (pazio, tab, nuova linea, ritorno
                                               // a capo, ecc)
                String targa = tok.nextToken();
                line = br.readLine();
                String modello = line;
                line = br.readLine();
                String marca = line;
                line = br.readLine();
                if (tipo.equals("auto")) {
                    tok = new StringTokenizer(line);
                    int cilindrata = Integer.parseInt(tok.nextToken());
                    double capienza = Double.parseDouble(tok.nextToken());
                    line = br.readLine();
                    double costo = Double.parseDouble(line);

                    Auto a = new Auto(cod, targa, modello, marca, costo, cilindrata, capienza);
                    veicoli.add(a);
                    codProg.put(cod, a);
                } else {
                    String categoria = line;
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int posti = Integer.parseInt(tok.nextToken());
                    boolean vano = Boolean.parseBoolean(tok.nextToken());
                    line = br.readLine();
                    double costo = Double.parseDouble(line);

                    Furgone f = new Furgone(cod, targa, modello, marca, costo, categoria, posti, vano);
                    veicoli.add(f);
                    codProg.put(cod, f);
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        // punto 2
        try {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                String nome = tok.nextToken();
                String cognome = tok.nextToken();
                Cliente c = new Cliente(nome, cognome);
                clienti.add(c);
                line = br.readLine();
                while (line != null) {
                    tok = new StringTokenizer(line);
                    int cod = Integer.parseInt(tok.nextToken());
                    int giorni = Integer.parseInt(tok.nextToken());
                    c.addVeic(codProg.get(cod), giorni);
                    line = br.readLine();
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        // punto 3
        System.out.println(
                "tipo, targa, codice, modello, marca, costo giornaliero, cilindrata, bagagliaio, categoria, numero di posti, vano di carico");
        for (Veicolo v : veicoli) {
            System.out.println(v);
        }
        System.out.println();

        // punto 4
        for (Cliente c : clienti) {
            System.out.println(c);
        }

        // punto 5

    }
}