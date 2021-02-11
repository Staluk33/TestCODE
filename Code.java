package Exercice;

public class Code {

	public static void main(String[] args) {
		

		
	}
	public class Voiture{
		
		private int roues = 4;
		private int portes;
		private int siege;
	}
	class Modele extends Voiture{
		
		private String nom;

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		
	}

}
