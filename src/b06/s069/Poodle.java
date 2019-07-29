package b06.s069;


public class Poodle {
	protected static final String DEFAULT_NAME = " ";
	protected static final int DEFAULT_WEIGHT = 4;
	protected String name;
	protected int weight;
	
	public Poodle () {
		this(DEFAULT_NAME, DEFAULT_WEIGHT); 
		
	}
//se mi passa solo il peso, userò il peso dell'utente e il nome di Default)
	
	public Poodle (int weight) {
		this(DEFAULT_NAME,weight); 
		
	}
	
	 

	public Poodle (String name, int weight) {
		super();
		this.name=name;
		this.weight=weight; 
		
	}

	@Override
	public String toString() {
		return this.name + ":" + this.weight;
	}

	public int getWeigth() {
		
		return weight;
	}
	
	

}