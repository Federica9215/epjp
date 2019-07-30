package b06.s71;

public class Stagista extends Person {
	
	private double rimborso;

	public Stagista(String nome, String cognome, double rimborso) {
		super(nome, cognome); 
		this.rimborso= rimborso; 
		
	}
	public double getrimborso() {
        return rimborso;
    }
	
	 @Override
	    public String toString() {
	        return "Stagista "+ "Nome: " + nome + " Cognome: " + cognome + " ---> Rimborso: "+ rimborso;
	    }

}

	

