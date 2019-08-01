package b09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class S100 {
    public static void main(String[] args) {
        Map<Integer, String> map = aMap();

        System.out.println("contains key 12: " + map.containsKey(12)); //mi chiede se c'è la chiave 12. Complessità O(1)
        System.out.println("contains value seven: " + map.containsValue("seven"));//containsValue(): complessità O(n) xkè me li devo far passare tt x vedere il 7

        Set<Map.Entry<Integer, String>> items = map.entrySet();//collezione di tt le entry. Items è un set di map entry che a sua volta è un integer
        for (Map.Entry<Integer, String> item : items) {
            item.setValue(item.getValue() + "!");//cambia il valore di item aggiungendo un !
        }

        Iterator<Map.Entry<Integer, String>> it = items.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> item = it.next();
            System.out.println("Key: " + item.getKey() + ", value: " + item.getValue());
        }

        System.out.println("Value for key -1 (or null): " + map.get(-1));//.get mi xmette di vedere un valore associato ad una chiave se esiste. se nn esiste mi ritorna il null
        System.out.println("Value for key -1 (or default): " + map.getOrDefault(-1, "missing"));//.getOrDefault : mi ritorna o il valore che gli ho passato come chiave o un valore di default che scelgo 

        Set<Integer> keys = map.keySet();
        System.out.println("Keys are: " + keys);

        System.out.println("Previous value for 99 was: " + map.put(99, "nintynine"));
        System.out.println("Current value for 99 is: " + map.putIfAbsent(99, "star"));//solo se nn c'è 99 metto dentro star. mi ritorna la stringa che è il valore precedente o null

        System.out.println("Removed value for key 23: " + map.remove(23));
        System.out.println("Replaced value for key 12: " + map.replace(12, "twelve"));
        
        System.out.println("Size is " + map.size());
        System.out.println("Values are: " + map.values());

        map.clear();
        System.out.println("Is the map empty? " + map.isEmpty());//se la collezione è piena o vuota
    }

    private static Map<Integer, String> aMap() {
        Map<Integer, String> result = new HashMap<>();
        result.put(7, "seven");
        result.put(12, "twelve");
        result.put(23, "twentythree");
        result.put(31, "thirtyone");
        result.put(42, "fortytwo");

        return result;
    }

}
