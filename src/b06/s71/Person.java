package b06.s71;

public class Person {
	public String nome=" ";
	public String cognome=" ";
	
	public Person(String nome, String cognome) {
        this.nome = nome;
        this.cognome= cognome;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCognome() {
        return cognome;
    }
}

