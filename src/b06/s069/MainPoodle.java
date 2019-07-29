package b06.s069;



public class MainPoodle {

	public static void main(String[] args) {
		Poodle [] poodles = {new Poodle ("Angelo", 14), new Poodle ("Gino", 7),
			new Poodle ("Trex", 3), new Poodle ("Ciao", 23)};
 
		Poodle fastest = poodles[0];
		for (int i=1; i<poodles.length; i++) {
			if (poodles[i].getWeigth()> fastest.getWeigth());
				fastest= poodles[i]; 
			} 
		

		System.out.println(fastest);
	}
}



