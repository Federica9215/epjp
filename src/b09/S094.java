package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class S094 {
    public static void main(String[] args) {
        Collection<Integer> coll = emptyCollection();

        coll.addAll(aCollection()); //aggiunge tt gli elementi di un'altra collection
        System.out.println(coll);

        if (coll.contains(-2233)) { //x vedere se c'è un elemento nella mia collezione. il primotivo viene automaticamente trasf in un Integer
            System.out.println("-2233 is there");
        }

        if (coll.equals(aCollection())) {//x ved se 2 collezioni sono uguali
            System.out.println("Same collection");
        }

        coll.add(42);
        if (!coll.equals(aCollection())) {
            System.out.println("Different collection");
        }

        System.out.println("The collection has " + coll.size() + " elements");

        Iterator<Integer> it = coll.iterator();//se voglio iterare su una collezione, prendo l iteratore che lavora su tt gli elementi. finchè l iteratore ha un successore prendi next e stampalo
        System.out.print("{ ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");//it.next=sposta il valore e ritornami l elemento contenuto
        }
        System.out.println('}');
        
        System.out.print("{ "); //qst modo è esattamente = all iteratore sopra scritto e ad oggi si preferisce qst all iteratore
        for(Integer value: coll) {
        	System.out.print(value + " ");
        }
        System.out.println('}');

        coll.remove(-5); //diventa un oggetto e viene fatto un remove sulla collection
        
        Integer[] values = coll.toArray(new Integer[coll.size()]);//mi sn creato un array della dim giusta, l ho passato alla colllection e mi ritorna i valori corretti
        System.out.println(Arrays.toString(values));
        
        coll.retainAll(aCollection());
        System.out.println(coll);
        
        coll.clear();
        System.out.println("Collection is empty? " + coll.isEmpty());
    }

    private static Collection<Integer> emptyCollection() {
        Collection<Integer> result = new ArrayList<Integer>();

        return result;
    }

    private static Collection<Integer> aCollection() {
        return Arrays.asList(12, 18, -5, -2233);//Arrays è come le Collections 
    }

}
