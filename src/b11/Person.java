package b11;

abstract class Person {
	private String name;
	private int energy;

	public Person(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}

	public String getName() {
		return name;
	}

	public int changeEnergy() {
		return energy;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", energy=" + energy + "]";
	}
}
