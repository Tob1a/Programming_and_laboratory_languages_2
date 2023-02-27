import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gestione {
    static List<Campo> campo = new LinkedList<Campo>();
    static List<Giocatore> giocatore = new LinkedList<Giocatore>();
    static Map<Integer, Campo> codProg = new HashMap<Integer, Campo>();

    public static void main(String[] args) {

        // punto 1

        try {
            BufferedReader br = new BufferedReader(new FileReader("campi.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                line = br.readLine();
                String name = line;
                line = br.readLine();
                tok = new StringTokenizer(line);
                float larghezza = Float.parseFloat(tok.nextToken());
                float lunghezza = Float.parseFloat(tok.nextToken());
                if (tipo.equals("squash")) {

                    float altezza = Float.parseFloat(tok.nextToken());
                    int piano = Integer.parseInt(tok.nextToken());
                    float orario = Float.parseFloat(tok.nextToken());

                    Squash s = new Squash(cod, name, larghezza, lunghezza, altezza, piano, orario);
                    campo.add(s);
                    codProg.put(cod, s);
                } else {
                    float temperatura = Float.parseFloat(tok.nextToken());
                    line = br.readLine();
                    String terreno = line;
                    line = br.readLine();
                    float costo = Float.parseFloat(line);

                    Tennis t = new Tennis(cod, name, larghezza, lunghezza, temperatura, terreno, costo);
                    campo.add(t);
                    codProg.put(cod, t);

                }

            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        // punto 2

        try {
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line = br.readLine();
            int cod = Integer.parseInt(line);
            line = br.readLine();
            String name = line;
            line = br.readLine();
            StringTokenizer tok = new StringTokenizer(line);
            int eta = Integer.parseInt(tok.nextToken());
            int categoria = Integer.parseInt(tok.nextToken());
            Giocatore g = new Giocatore(cod, name, eta, categoria);
            giocatore.add(g);
            line = br.readLine();
            tok = new StringTokenizer(line);
            while (tok.hasMoreTokens()) {
                int codcampo = Integer.parseInt(tok.nextToken());
                int ora = Integer.parseInt(tok.nextToken());
                g.addPrenotazione(codProg.get(codcampo), ora);
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}