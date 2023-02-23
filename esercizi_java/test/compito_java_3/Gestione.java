import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Gestione {
    static List<Campo> campo = new LinkedList<Campo>();
    static List<Giocatore> giocatore = new LinkedList<Giocatore>();
    static Map<Integer, Campo> codProg = new HashMap<Integer, Campo>();

    public static void main(String[] args){


        //punto 1 

        try{
            BufferedReader br = new BufferedReader(new FileReader("campi.txt"));
            String line = br.readLine();
            while(line!=null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                
            }
        }
    }
}