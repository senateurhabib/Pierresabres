package personnages;


import personnages.Humains;

public class Samourai extends Humains {
    private String seigneur;

    public Samourai(String seigneur, String nom, String boissonFavorite, int age) {
        super(nom, nom, age);
        this.seigneur = seigneur;
    }

    @Override
    public void direBonjour() {
        System.out.println("(" + this.getNom() + ") - Bonjour ! Je m�appelle " + this.getNom() +
                " et j�aime boire du " + this.getBoisson() + ".");
        System.out.println("(" + this.getNom() + ") - Je suis fier de servir le seigneur " + this.seigneur + ".");
    }

    public class Humain {
        private static final int TAILLE_MEMOIRE = 30;
        private String nom;
        private int age;
        private String[] memoire;
        private int indexMemoire;

        public Humain(String nom, int age) {
            this.nom = nom;
            this.age = age;
            this.memoire = new String[TAILLE_MEMOIRE];
            this.indexMemoire = 0;
        }

        public void faireConnaissanceAvec(Humain autreHumain) {
            direBonjour();
            autreHumain.direBonjour();
            
            // Ajouter l'autreHumain � la m�moire de this
            this.memoire[this.indexMemoire] = autreHumain.getNom();
            this.indexMemoire++;

            // Ajouter this � la m�moire de autreHumain
            autreHumain.memoire[autreHumain.indexMemoire] = this.getNom();
            autreHumain.indexMemoire++;

            // G�rer le d�passement de la taille de la m�moire
            if (this.indexMemoire >= TAILLE_MEMOIRE) {
                this.oublierPersonneLaPlusAncienne();
            }
            if (autreHumain.indexMemoire >= TAILLE_MEMOIRE) {
                autreHumain.oublierPersonneLaPlusAncienne();
            }
        }

        private void oublierPersonneLaPlusAncienne() {
            // Code pour oublier la personne la plus ancienne dans la m�moire
            // (dans cet exemple, on supprime la premi�re personne ajout�e)
            for (int i = 0; i < TAILLE_MEMOIRE - 1; i++) {
                this.memoire[i] = this.memoire[i + 1];
            }
            this.indexMemoire--;
        }

        public void listerConnaissance() {
            System.out.print("(" + this.getNom() + ") - Je connais beaucoup de monde dont : ");
            for (int i = 0; i < this.indexMemoire; i++) {
                System.out.print(this.memoire[i]);
                if (i < this.indexMemoire - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        public void direBonjour() {
            System.out.println("(" + this.getNom() + ") - Bonjour ! Je m�appelle " + this.getNom() +
                    " et j�aime boire du th�.");
        }

        public String getNom() {
            return nom;
        }
    }

    public void boire(String boisson) {
        System.out.println("(" + this.getNom() + ") - Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
    }
}
