package gestione;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author tobiasacchetto
 */
public class gestione {

    /**
     * @param args the command line arguments
     */
    static List<veicolo> veicoli = new LinkedList<veicolo>();
    static List<cliente> clienti = new LinkedList<cliente>();
    static Map<Integer, veicolo> codProg = new HashMap<Integer, veicolo>();
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //punto 1
        
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("veicoli.txt"));
            String line = br.readLine();
            while(line != null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String targa = tok.nextToken();
                line = br.readLine();
                String modello = line;
                line = br.readLine();
                String marca = line;
                line = br.readLine();
                
                if(tipo.equals("auto"))
                {
                    tok = new StringTokenizer(line);
                    int cilindrata = Integer.parseInt(tok.nextToken());
                    int bagaglio = Integer.parseInt(tok.nextToken());
                    line = br.readLine();
                    Double costo = Double.parseDouble(line);
                    
                    auto a = new auto(cod, targa, modello, marca, costo, cilindrata, bagaglio);
                    veicoli.add(a);
                    codProg.put(cod, a);
                    
                }
                else{       
                    String categoria = line;
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int posti = Integer.parseInt(tok.nextToken());
                    Boolean vano = Boolean.parseBoolean(tok.nextToken());
                    line = br.readLine();
                    Double costo = Double.parseDouble(line);
                    
                    furgone f = new furgone(cod,targa, modello, marca, costo, categoria, posti, vano);
                    veicoli.add(f);
                    codProg.put(cod,f);
                }
                line = br.readLine();
                
            }
            br.close();
        }catch(IOException e){
        System.err.println(e);
        }catch(Exception e){
        System.err.println(e);
        }
        
        
        
        
        //punto 2
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            
            while(line != null){
            StringTokenizer tok = new StringTokenizer(line);
            String nome = tok.nextToken();
            String cognome = tok.nextToken();
            line = br.readLine();
            tok = new StringTokenizer(line);
            cliente c = new cliente(nome, cognome);
            clienti.add(c);
            while(tok.hasMoreTokens()){
                int cod = Integer.parseInt(tok.nextToken());
                int giorni = Integer.parseInt(tok.nextToken());
                c.addVeic(codProg.get(cod), giorni);
                }
            line = br.readLine();
            }
            br.close();
        }catch(IOException e){
            System.err.println(e);
        }catch(Exception e){
            System.err.println(e);
        }
        
        //punto 3
        
        System.out.println("tipo, targa, codice, modello, marca, costo giornaliero, cilindrata, bagagliaio, categoria, numero di\n" +
"posti, vano di carico");
        for (veicolo v : veicoli){
        System.out.println(v);
        }
        
        
        
        //punto 4
        for(cliente c : clienti){
            System.out.println(c);
        }
        
        
        //punto 5
        System.out.println();
        int veicolo = Integer.parseInt(args[0]);
        double bellissimo=0;
        for(cliente c: clienti)
            bellissimo = c.getmassimo(veicolo)+bellissimo;
        System.out.println(bellissimo);
    }
    
    
}
