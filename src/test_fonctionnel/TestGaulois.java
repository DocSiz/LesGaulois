package test_fonctionnel;

import objet.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain brutus = new Romain("Brutus", 6);
		Druide pano = new Druide("Panoramix", 2, null );
		
		
		pano.fabriquerPotion(4, 3);
		pano.boosterGaulois(obelix);
		pano.boosterGaulois(asterix);
		for (int i=0;i<3;i++) {
			asterix.frapper(brutus);
		}

	}
	

}
