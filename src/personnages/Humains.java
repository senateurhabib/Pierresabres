package personnages;
public class Humains {
	private String nom;
	private String boisson;

	public int argent;
	
	
	


	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}


	public int getArgent() {
		return argent;
	}
	
		
    public void setArgent(int argent) {
		this.argent = argent;
	}


	public Humains(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}


	public void parler(String texte) {
    	System.out.println(prendreParole() + texte);

    }

    private String prendreParole() {
        return "(" + nom + ")- ";
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
	}
	
	public void boire() {
		System.out.println(prendreParole() + "Mmmm, un bon verre de " + getBoisson() + " GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (prix<=argent) {
			perdreArgent(prix);
			parler("J'ai "+ argent + " sous en poche, je vais pouvoir m'acheter un " + bien + " a " + prix +" sous " );
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un kimono a " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.argent = gain;
	}
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	


	public static void main(String[] args) {
		Humains h1 = new Humains("Ali", "Orangina", 56);
		h1.perdreArgent(6);
		System.out.println(h1.argent);

	}

	public void boire(String boisson) {
		// TODO Auto-generated method stub
		
	}

}
		
	