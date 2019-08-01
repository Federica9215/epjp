package b11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Villain ("Tiziana", 15, 4));
		persons.add(new Villain ("Gino", 7, 3));
		persons.add(new Hero ("Giulio", 10, 5));
		persons.add(new Hero ("Federica", 8, 8));
		persons.add(new CommonPerson ("Silvia", 20, 2));
		persons.add(new CommonPerson ("Vito", 5, 10));
		
		ArrayList<Person> prisoners = new ArrayList<Person>();
		ArrayList<Person> dead = new ArrayList<Person>();
		

	}

}
