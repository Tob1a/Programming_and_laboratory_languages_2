package palestra;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author tobiasacchetto
 */
public class Gestione {

    
    
    static List<Dipendente> dipendenti = new LinkedList<Dipendente>();
    static List<Cliente> clienti = new LinkedList<Cliente>();
    static Map<Integer, Dipendente> codProg = new HashMap<Integer, Dipendente>();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //punto 1
        try{
            BufferedReader br = new BufferedReader(new FileReader("dipendenti.txt"));
            String line = br.readLine();
            while(line != null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod= Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                line = br.readLine();
                String nome = line;
                line = br.readLine();
                tok = new StringTokenizer(line);
                if(tipo.equals("trainer"))
                {
                    int ore = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    line = br.readLine();
                    String specialita = line;
                    
                    
                    Trainer t = new Trainer(cod, nome,costo,ore,specialita);
                    dipendenti.add(t);
                    codProg.put(cod, t);
                }else{
                    long telefono = Long.parseLong(tok.nextToken());
                    boolean medico = Boolean.parseBoolean(tok.nextToken());
                    int appuntamenti = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    
                    
                    Nutrizionista n = new Nutrizionista (cod, nome, costo,telefono,medico,appuntamenti);
                    dipendenti.add(n);
                    codProg.put(cod,n);
                }
                line= br.readLine();
                
            }
            br.close();
        }catch(IOException e){
            System.err.print(e);
        }catch(Exception e){
            System.err.print(e);
        }
        
        
        //punto 2
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            while(line!= null){
                int cod = Integer.parseInt(line);
                line = br.readLine();
                String nome = line;
  
                Cliente c = new Cliente(cod, nome);
                clienti.add(c);
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                while(tok.hasMoreTokens()){
                    int codcliente = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());
                    c.addServizio(codProg.get(codcliente), ore);
                    line = br.readLine();
                     if(line != null){
                    tok = new StringTokenizer(line);}
                }
                if(line != null)
                    line = br.readLine();
            }
            br.close();
        }
        catch(IOException e){
                System.err.print(e);
        }catch(Exception e ){
                System.err.print(e);
                }
        
        
        //punto 3
        System.out.println("bla bla");
        for(Dipendente d: dipendenti){
            System.out.println(d);
        }
        
        
        //punto 4
        
        System.out.println();
        
        for(Cliente c : clienti){
            System.out.println(c);
        }
        
        
        //punto 5
        System.out.println();
        int a=0;
        int b=0;
        int ciaone=0;
        String duna="";
        String nome="";
        for(Dipendente d: dipendenti){
            for(Cliente c: clienti){
                b=c.numServ(d.cod);
                if(ciaone>=a){
                    a=b+a;
                    nome=d.nome; 
                }
                
                    
                    
            }
            ciaone=a;
            a=0;
            duna=nome;
        }
        System.out.println(duna+"\t"+ciaone);
        
        }
        
    
}
    

