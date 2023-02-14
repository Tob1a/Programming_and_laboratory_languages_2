import java.util.Scanner;


public class Gestione {
    static List<Veicolo> veicoli = new LinkedList<Veicolo>();
    static List<Cliente> clienti = new LinkedList<Cliente>();
    static Map<Integer, Veicolo> codProg = new HashMap<Integer, Veicolo>;


public static Void Main(String[] args) {
    //punto 1
        try {
            BufferedReader br = new BufferedReader(new FileReader("veicoli.txt"));
            String line = br.readLine();
            while(line !=null){
            StringTokenizer tok = new StringTokenizer(line);
            int cod= Integer.parseInt(tok.nextToken());
            String tipo = tok.nextToken(); //delimita automaticamente le stringhe con i delimitatori predefiniti che include tutti i parametri spazio (pazio, tab, nuova linea, ritorno a capo, ecc)
            String targa = tok.nextToken();
            line = br.readLine();
            String modello = line;
            line = br.readLine();
            String marca = line;
            line = br.readLine();
            if(tipo.equals("auto")){
                tok = new StringTokenizer(line);
                int cilindrata = Integer.parseInt(tok.nextToken());
                double capienza = Double.parseDouble(tok.nextToken());

                Veicolo t = new Veicolo(cod, targa, modello, marca, cilindrata, capienza);
                veicoli.add(t);
                codProg.put(cod, t);
            }
            else{
                String categoria = line;
                line = br.readLine();
                tok = new StringTokenizer(line);
                int posti = Integer.parseInt(tok.nextToken());
                boolean vano = Boolean.parseBoolean(tok.nextToken());

                Veicolo t = new Veicolo(cod, targa, modello, marca, categoria, posti, vano);
                veicoli.add(t);
                codProg.put(cod, t);
            }
            line = br.readLine();
        }
        br.close();
    }catch (Ioexpection e){
        System.err.println(e);
    }catch (Exception e){
        System.err.println(e);
    }
    //punto 2
}