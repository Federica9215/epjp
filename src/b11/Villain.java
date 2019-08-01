package b11;

public class Villain extends Person {
	private int shootingPower;

	public Villain(String name, int energy, int shootingPower) {
		super(name, energy);
		this.shootingPower = shootingPower;
	}

	public int getShootingPower(Person p) {
		return shootingPower;
	}

	@Override
	public String toString() {
		return "Villain [shootingPower=" + shootingPower + super.toString() + "]";
	}

	
}
