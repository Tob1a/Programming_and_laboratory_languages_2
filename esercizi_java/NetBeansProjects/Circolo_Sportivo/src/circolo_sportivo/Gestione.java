package circolo_sportivo;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
 
/**
 *
 * @author tobiasacchetto
 */
public class Gestione {

    
    static List<Campo> campi = new LinkedList<Campo>();
    static List<Giocatore> giocatori = new LinkedList<Giocatore>();
    static Map<Integer, Campo> codProg = new HashMap<Integer, Campo>();
    
    
    public static void main(String[] args) {
        
        
        //punto 1
        try{
            BufferedReader br = new BufferedReader(new FileReader("campi.txt"));
            String line = br.readLine();
            while(line!=null){
            StringTokenizer tok = new StringTokenizer(line);
            int cod = Integer.parseInt(tok.nextToken());
            String tipo = tok.nextToken();
            line = br.readLine();
            String nome =line;
            line = br.readLine();
            tok = new StringTokenizer(line);
            float larghezza = Float.parseFloat(tok.nextToken());
            float lunghezza = Float.parseFloat(tok.nextToken());
            if(tipo.equals("tennis")){
                
                float temperatura = Float.parseFloat(tok.nextToken());
                line = br.readLine();
                String terreno = line;
                line = br.readLine();
                float costorario = Float.parseFloat(line);
                
                Tennis t = new Tennis(cod,nome,larghezza,lunghezza,costorario,temperatura,terreno);
                campi.add(t);
                codProg.put(cod,t);
                
            }
            else{
                float altezza = Float.parseFloat(tok.nextToken());
                int piano  = Integer.parseInt(tok.nextToken());
                float costorario = Float.parseFloat(tok.nextToken());
                Squash s = new Squash(cod,nome,larghezza,lunghezza,costorario,altezza,piano);
                campi.add(s);
                codProg.put(cod, s);
            }
            line = br.readLine();}
            br.close();
            
            
            
        }
        catch(IOException e){
                System.err.print(e);
                }
        catch(Exception e){
                System.err.print(e);
                }
        
        
        
        //punto 2
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line = br.readLine();
            while(line != null){
            int cod = Integer.parseInt(line);
            line = br.readLine();
            String nome = line;
            line = br.readLine();
            StringTokenizer tok = new StringTokenizer(line);
            int eta = Integer.parseInt(tok.nextToken());
            int categoria = Integer.parseInt(tok.nextToken());
            Giocatore g = new Giocatore(cod,nome,eta,categoria);
            giocatori.add(g);
            line = br.readLine();
            tok = new StringTokenizer(line);
            while(tok.hasMoreTokens()){
                int codcamp = Integer.parseInt(tok.nextToken());
                int orainiz = Integer.parseInt(tok.nextToken());
                //chiamata funzione dentro classe Giocatore
                
                g.addPrenotazione(codProg.get(codcamp),orainiz);
            }
            line = br.readLine();
            }
            
            
        }catch(IOException e){
            System.err.print(e);
        }catch(Exception e){
            System.err.print(e);
        }
        
        
        //punto 3
        for(Campo c : campi){
            System.out.println(c);
        }
        
        
        //punto 4
        System.out.println();
        for(Giocatore g : giocatori){
            System.out.println(g);
        }
        
        //punto 5
        System.out.println();
        int lol = Integer.parseInt(args[0]);
        float costot=0;
        for(Giocatore g : giocatori){
            costot=g.volte(lol)+costot;

            
        }
        
        System.out.println(costot);
        
        
        
        
    }
    
}
