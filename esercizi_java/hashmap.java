//esempio di hashmap fatta da chat gpt
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        // Creazione di una nuova hashmap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Inserimento di alcune coppie chiave-valore
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        // Recupero del valore associato a una chiave
        int age = map.get("Bob");
        System.out.println("L'età di Bob è: " + age);
        
        // Modifica del valore associato a una chiave
        map.put("Bob", 40);
        age = map.get("Bob");
        System.out.println("L'età di Bob è: " + age);
        
        // Verifica se una chiave esiste nella hashmap
        boolean exists = map.containsKey("David");
        System.out.println("Esiste una voce per David? " + exists);
    }
}