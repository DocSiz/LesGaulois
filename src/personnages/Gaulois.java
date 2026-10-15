package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		

		
	}

	private String prendreParole() {
		return "Le gaulois " + nom	+ " : ";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
		
	}

	@Override
	public String toString() {
		return nom;
	}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		if (effetPotion > 1) {
			romain.recevoirCoup((force*effetPotion)/3);
			effetPotion--;
		}
		else {romain.recevoirCoup(force/3);}
	}
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void setVillage(Village village) {
		
	}
	
	public void sePresenter() {
		if (true) {
			System.out.println("Le Gaulois " + nom + ": Bonjour, je m'appelle " + nom + ". Je suis le chef du village : "  ); //+ nom_village );
		}
		//else if () {
		//	System.out.println("Le Gaulois " + nom + ": Bonjour, je m'appelle " + nom + ". J'habite le village : " + nom_village );
		//}
		//else {
		//	System.out.println("Le Gaulois " + nom + ": Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		}
	}
//}
