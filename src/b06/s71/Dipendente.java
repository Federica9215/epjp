package b06.s71;

public class Dipendente extends Person {

	private double stipendio;

	public Dipendente(String nome, String cognome, double stipendio) {
		super(nome, cognome); 
		this.stipendio= stipendio; 
		
	}
	public double getstipendio() {
        return stipendio;
    }
	
	 @Override
	    public String toString() {
	        return "Dipendente "+ "Nome: " + nome + " Cognome: " + cognome + " ---> Stipendio: "+ stipendio;
	    }

}
