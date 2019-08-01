package b11;

public class CommonPerson extends Person {
	private int goodness;

	public CommonPerson(String name, int energy, int goodness) {
		super(name, energy);
		this.goodness = goodness;

	}

	public int getGoodness() {
		return goodness;
	}

	@Override
	public String toString() {
		return "CommonPerson [goodness=" + goodness + super.toString() + "]";
	}

}
