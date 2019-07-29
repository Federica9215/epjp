package b06.s069;

public class Poodle {
	private static final String DEFAULT_NAME = " ";
	private static final int DEFAULT_WEIGHT = 4;
	private String name;
	private int weight;

	public Poodle(String name, int weight) {

		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.DEFAULT_WEIGHT;
	}
	
	

}