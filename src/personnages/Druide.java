package personnages;

import objet.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force, Chaudron chaudron) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
			
	}

	private String prendreParole() {
		return "Le druide " + nom	+ " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion et ca force est " + forcePotion);
		
	}
	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion) {
			if (nomGaulois == "Obélix") {
				parler("Non " + nomGaulois + " Non ! Et tu le sais très bien!");
			}
			else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
			}
		}
		
		
		
	}
	
}
