package b06.s71;



public class Main {
	public static void main(String[] args) {
		Person[] persona = new Person[2];
		persona[0] = new Dipendente("Paolo", "Grimaldi", 1265.32);
		persona[1] = new Stagista("Federica", "Cosenza", 850.00);

		for (Person person : persona) {
            System.out.println(person.toString());
        }
	}
}
