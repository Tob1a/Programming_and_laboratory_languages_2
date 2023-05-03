package universita;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author tobiasacchetto
 */
public class Gestione {

    static List<Corso> corsi = new LinkedList<Corso>();
    static List<Studente> studenti = new LinkedList<Studente>();
    static Map<Integer, Corso> codProg= new HashMap<Integer, Corso>();
    
    
    public static void main(String[] args) {
       
        //punto 1
        
        try{
        BufferedReader br = new BufferedReader(new FileReader("corsi.txt"));
        String line = br.readLine();
        while(line!= null){
            StringTokenizer tok = new StringTokenizer(line);
            int cod = Integer.parseInt(tok.nextToken());
            String tipo = tok.nextToken();
            line = br.readLine();
            String nomecorso = line;
            line = br.readLine();
            String nomedoc = line;
            line = br.readLine();
            if(tipo.equals("teoria")){          
                tok = new StringTokenizer(line);
                int codaula = Integer.parseInt(tok.nextToken());
                int oreset = Integer.parseInt(tok.nextToken());
                double orelez = Double.parseDouble(tok.nextToken());
                Teoria t = new Teoria(cod,nomecorso,nomedoc,codaula,oreset,orelez);
                corsi.add(t);
                codProg.put(cod,t);
                

            }else{
                String nomelab = line;
                line = br.readLine();
                String nomeass = line;
                line = br.readLine();
                int numpos = Integer.parseInt(line);
                Laboratorio l = new Laboratorio(cod,nomecorso,nomedoc,nomelab,nomeass,numpos);
                corsi.add(l);
                codProg.put(cod,l);
                
                
            }
            line = br.readLine();
            line = br.readLine();
        }
        br.close();
        
        }catch(IOException e){
            System.err.print(e);
        }catch(Exception e){
            System.err.print(e);
        }
        
        
        //punto 2
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("studenti.txt"));
            String line = br.readLine();
            while(line!=null){
                int cod = Integer.parseInt(line);
                line = br.readLine();
                String nome = line;
                Studente s = new Studente(cod,nome);
                studenti.add(s);
                line = br.readLine();
                while(line!=null && !line.equals("") ){ //devi mettere prima la null e poi l'equal senno non funziona
                    StringTokenizer tok = new StringTokenizer(line);
                    int codcor = Integer.parseInt(tok.nextToken());
                    String voto= tok.nextToken();
                    s.addCorso(codProg.get(codcor), voto);
                    line = br.readLine();
                }
                if(line!=null)
                    line = br.readLine();
            }
            br.close();
        }catch(IOException e){
            System.err.print(e);
        }catch(Exception e){
            System.err.print(e);
        }
        
        
        //punto 3
        
        System.out.println("nome, codice, docente, tipo, aula, ore sett., ore/lez., lab., assistente, postazioni");
        for(Corso c: corsi){
            System.out.println(c);
        }
        
        
        //punto 4
        System.out.println();
        for(Studente s: studenti){
            System.out.println(s);
        }
        
        //punto 5
        System.out.println();
        int b=Integer.parseInt(args[0]);
        for(Studente s: studenti){
            if(b==s.cod){
                System.out.println(s.nome+"\t"+s.max());
            }
        }
    }
    
}
