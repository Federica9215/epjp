package b11;

public class Hero extends Person {
	private int bonusHelp;

	public Hero(String name, int energy, int bonusHelp) {
		super(name, energy);
		this.bonusHelp = bonusHelp;

	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean arrest(Person p) {
//		if () {
//			
//		}
		return true;
	}

	@Override
	public String toString() {
		return "Hero [bonusHelp=" + bonusHelp + super.toString() + "]";
	}

}
