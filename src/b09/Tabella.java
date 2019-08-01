package b09;

import java.util.ArrayList;

public class Tabella {
	private ArrayList<Integer> tabella;

	public Tabella() { //costruttore della tabella 
		tabella = new ArrayList<Integer>();
	}

	public void add(int a) {
		tabella.add(a);
	}

	public boolean check(int b) {

		return tabella.contains(b);

	}

	public void getData() {
		tabella.sort(null);
	}

//		for (int i = 0; i < a.length; i++) {
//			tabella.add(a[i]);
//		}
//		return tabella;
//
//		boolean numero = tabella.contains(a);
//		if (numero == true) {
//			System.out.println("La tabella contiene il numero");
//
//		}
//	}
}
