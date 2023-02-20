import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gestione {
    static List<Dipendente> dipendente = new LinkedList<Dipendente>();
    static List<Cliente> cliente = new LinkedList<Cliente>();
    static Map<Integer, Dipendente> codProg = new HashMap<Integer, Dipendente>();

    public static void main(String[] args) {

        // punto 1
        try {
            BufferedReader br = new BufferedReader(new FileReader("dipendenti.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                line = br.readLine();
                String nome = line;
                line = br.readLine();
                if (tipo.equals("trainer")) {
                    tok = new StringTokenizer(line);
                    int ore = Integer.parseInt(tok.nextToken());
                    double cost = Double.parseDouble(tok.nextToken());
                    line = br.readLine();
                    String specialita = line;

                    Trainer t = new Trainer(cod, nome, cost, ore, specialita);
                    dipendente.add(t);
                    codProg.put(cod, t);

                } else {
                    tok = new StringTokenizer(line);
                    long telefono = Long.parseLong(tok.nextToken());
                    boolean medico = Boolean.parseBoolean(tok.nextToken());
                    int appuntamenti = Integer.parseInt(tok.nextToken());
                    double cost = Double.parseDouble(tok.nextToken());

                    Nutrizionista n = new Nutrizionista(cod, nome, cost, telefono, medico, appuntamenti);
                    dipendente.add(n);
                    codProg.put(cod, n);

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
                int cod = Integer.parseInt(line);
                line = br.readLine();
                String name = line;
                Cliente c = new Cliente(cod, name);
                cliente.add(c);
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                while (tok.hasMoreTokens()) {
                    int codidip = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());
                    line = br.readLine();
                    c.addServizio(codProg.get(codidip), ore);
                    if (line != null)
                        tok = new StringTokenizer(line);
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
        System.out
                .println("nome, codice, tipo, ore settimanali, specialità, telefono, medico, app.sett., costo orario");
        for (Dipendente d : dipendente) {
            System.out.println(d.toString());
        }
        System.out.println();

        // punto 4
        for (Cliente c : cliente) {
            System.out.println(c);
        }

        // punto 5
        System.out.println();
        String name = null;
        int ciaone = 0;
        for (Cliente c : cliente) {
            if (ciaone <= c.getMaximo()) {
                ciaone = c.getMaximo();
                name = c.getName();
            }

        }

        System.out.println(name + "\t" + ciaone);
    }

}
