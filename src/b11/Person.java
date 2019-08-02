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

	public void changeEnergy(int delta) {
		this.energy+=delta;
		
	}

	public boolean alive() {
		if(energy==0) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", energy=" + energy + "]";
	}
}
