package imc;

public class IMC {
	
	String nom;
	int taille;
	int poids;
	
	
	public IMC(String nom, int taille, int poids) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
	}
	
	// Méthode qui calcule l'IMC de l'objet courant
	private int calculImc() {
		int imc;
		if (poids <= 0 || taille <= 0) {
			imc = 0;
		} else {
			imc = (int) (10000 * poids / (double) (taille * taille));
		}
		return imc;
	}
	
	// Methode qui analyse l'IMC de l'objet courant
	public String analyseImc() {
		int imc = this.calculImc();
		String str = new String();
		if (imc < 16) {
			str = "Anorexie";
		} else if (imc >= 16 && imc < 20) {
			str = "Maigreur";
		} else if (imc >= 20 && imc < 26) {
			str = "Corpulence normale";
		} else if (imc >= 26 && imc < 30) {
			str = "Surpoids";
		} else {
			str = "Obesité";
		}
		return str;

	}

	
	@Override
	public String toString() {
		return  "nom = " + nom + ", taille = " + taille + ", poids = " + poids+ " " + analyseImc();
		
	}
	
	 
}
