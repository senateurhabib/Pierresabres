package histoire;

import personnages.Commercant;
import personnages.Humains;
import personnages.Ronain;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humains prof = new Humains("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant c1 = new Commercant("Marco", "undefined", 15);
		c1.direBonjour();
		c1.seFaireExtorquer();
		c1.recevoirArgent(15);
		c1.boire();
	
		
		Yakuza yak = new Yakuza("Yaku Le Noir", "Whysky", 45, "Warsong" );
		yak.direBonjour();
		yak.extorquer(c1);
	
	
		Ronain ron = new Ronain("Roro", "shoshu", 60);
		ron.direBonjour();
		ron.don(c1);
		
		ron.provoquer(yak);
	
	}

}