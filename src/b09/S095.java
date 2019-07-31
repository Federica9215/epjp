package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S095 {
    public static void main(String[] args) {
        List<Integer> list = aList();
        System.out.println(list);
        
        List<Integer> I2 = new ArrayList<>();
        I2.add(12);
        I2.add(18);
        I2.add(-5);
        I2.add(-997);

        System.out.println("At index 2: " + list.get(2));//.get ti ritorna il valore
        list.add(2, -997); //alla posizione 2 aggiungi l elemento "-997", quello che era alla posizione 2 verrà traslato nella posizione 3
        System.out.println("Index of -997: " + list.indexOf(-997)); //.indexOf ritorna l'indice

        list.remove(3);
        list.set(3, 42);
        System.out.println(list);
    }

    private static List<Integer> aList() {
        return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233));
    }
}

//i valori li do in pasto ad arrays.aslist che ritorna una lista di size fissa, la passo al costruttore dell array. mi copia gli elementi dell oggetto su cui pox fare tt qll che voglio