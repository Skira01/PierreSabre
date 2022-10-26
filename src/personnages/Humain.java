package personnages;

public class Humain {

	private String nom;
	private String boissonPreferee;
	private int qttArgent;
	
    public Humain(String nom, String boissonPreferee, int qttArgent) {
        this.nom = nom;
        this.boissonPreferee = boissonPreferee;
        this.qttArgent = qttArgent;
    }
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonPreferee() {
		return boissonPreferee;
	}
	
	public int getQttArgent() {
		return qttArgent;
	}
	
    public void parler(String texte) {
        System.out.println("("+nom+")- "+texte);
    }

    public void direBonjour() {
    	parler("Bonjour! Je m'appelle "+nom+" et j'aime boire du "+boissonPreferee);
    }
    
    public void boire() {
    	parler("Mmmm, un bon verre de "+boissonPreferee+"! GLOUPS ! ");
    }
    
    public void acheter(String bien, int prix) {
    	if (prix <= qttArgent) {
    		parler ("J'ai "+qttArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
    		perdreArgent(prix);
    	}
    	else {
    		parler("Je n'ai plus que "+qttArgent+" sous en poche. Je ne peut même pas m'acheter "+bien+" à "+prix+"sous.");
    	}
    }
    
    public int gagnerArgent(int gain) {
    	return qttArgent + gain;
    }
    
    public int perdreArgent(int perte) {
    	return qttArgent - perte;
    }
    
    
    
}
