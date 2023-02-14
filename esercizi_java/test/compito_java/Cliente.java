public class Cliente{
    private String nome,cognome;
    private List<Noleggio> veicolo;

    public class Cliente(String nome, String cognome){
            this.nome = nome;
            this.cognome = cognome;
            this.progetti= new LinkedListl<Noleggio>();
    }

    public String getNome() {
        return nome;
    }

    public String getCognome{
        return cognome;
    }
/*
    public double getMax{
        double max = 0;
        Noleggio maxi=null;
        for(Noleggio i:veicolo){
            if(i.getPrezzo()>max){
                max = i.getPrezzo();
                maxi = i;   
            }     
        }
        return maxi;
    }
*/
    public double getTotal{
        double total = 0;
        for(Noleggio i:veicolo){
            total = i.getPrezzo()+total;
        }
        return total;
    }

}