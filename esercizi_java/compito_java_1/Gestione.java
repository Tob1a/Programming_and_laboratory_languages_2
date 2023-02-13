import java.io.*;
import java.util.*;

public class Gestione {

    static List<Progetto> progetti = new LinkedList<Progetto>();
    static List<Ricercatore> ricercatori = new LinkedList<Ricercatore>();
    static Map<Integer, Progetto> codProg = new HashMap<Integer, Progetto>();

    public static void main(String[] args) {

        // PUNTO 1: memorizzazione progetti
        try {
            BufferedReader br = new BufferedReader(new FileReader("progetti.txt")); // br abbrevia il buffered reader Apre il file progetti.txt
            String line = br.readLine(); // all'interno di line si puo chiamare la frase
            while (line != null) { // finche non finisce il documento
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());// converte la stinga in int e la inserisce nella variabile
                                                            // cod
                String tipo = tok.nextToken(); // gli sta dicendo di mettere la stringa all'interno della variable tipo
                line = br.readLine(); // si usa oer andare a capo e leggere la linea
                String titolo = line; // salva la riga nella variabile titolo
                line = br.readLine();
                String coord = line;
                line = br.readLine();
                String org = line;
                line = br.readLine(); // legge la linea
                if (tipo.equals("ricerca")) {
                    tok = new StringTokenizer(line);
                    String arg = tok.nextToken(); // esempio primo ARG è PE5
                    int partner = Integer.parseInt(tok.nextToken()); // esempio primo partner=4
                    line = br.readLine();
                    double tot = Double.parseDouble(line); // recupera il valore e lo inserisce nella variabile double
                                                           // tot
                    Ricerca t = new Ricerca(cod, titolo, coord, org, arg, partner, tot);
                    progetti.add(t); // aggiunge i valori nella lista progetti
                    codProg.put(cod, t); // aggiunge il codice indentificativo e il codice identificativo della lista
                                         // nella lista codProg
                } else {
                    tok = new StringTokenizer(line);
                    int aziende = Integer.parseInt(tok.nextToken());
                    double tot = Double.parseDouble(tok.nextToken());
                    Innovazione i = new Innovazione(cod, titolo, coord, org, aziende, tot); // crea variabile
                                                                                            // innovazione e inserisce i
                                                                                            // valore
                    progetti.add(i); // aggiunge la variabile i di tipo innovazione alla lista progetti
                    codProg.put(cod, i); // mette la chiave cod e poi il valore i
                }
                line = br.readLine(); //continua a leggere
            }
            br.close(); //chiude la variabile buffered reader
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        // PUNTO 2: lettura di tutti i ricercatori

        try {
            BufferedReader br = new BufferedReader(new FileReader("ricercatori.txt"));
            String line = br.readLine();
            while (line != null) {
                String nome = line;
                line = br.readLine();
                String cognome = line;
                Ricercatore r = new Ricercatore(nome, cognome); // create una nuova instanza della classe ricercatore
                ricercatori.add(r); //aggiunge la nuova ricercatore e i suoi valori prima creati alla lista ricercatori
                line = br.readLine();
                while (line != null && !line.equals("")) { // finche non finisce il documento e finche la linea è uguale a "" 
                    StringTokenizer tok = new StringTokenizer(line); //inizializza la variabile tok
                    int cod = Integer.parseInt(tok.nextToken()); 
                    double imp = Double.parseDouble(tok.nextToken());
                    r.addProg(codProg.get(cod), imp); // get serve per prendere il valore come prima con put. recupera
                                                      // il valore associato ad una chiave
                    line = br.readLine();
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }

        // PUNTO 3: stampa di tutti i progetti
        System.out.println(
                "tipo, titolo, codice, coordinatore, organizzazione, argomento, partner, aziende, importo totale in migliaia di euro");
        for (Progetto p : progetti)
            System.out.println(p);
        System.out.println();
        // PUNTO 4: stampa ricercatori
        for (Ricercatore r : ricercatori)
            System.out.println(r);

        // PUNTO 5: stampe dell'esame con voto piu' alto
        System.out.println();
        String cog = args[0];
        for (Ricercatore r : ricercatori) {
            if (r.getCognome().equals(cog)) {
                Impegno i = r.getMax();
                System.out
                        .println(r.getNome() + " " + r.getCognome() + " " + i.getOre() + " " + i.getProg().getTitolo());

            }
        }

    }
}
