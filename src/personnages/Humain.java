package personnages;

public class Humain {

	protected String nom;
	protected String boissonPreferee;
	protected int qttArgent;
	protected int taille = 3;
	protected Humain[] memoire = new Humain[taille];
	
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
	
    protected void parler(String texte) {
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
    
    public void repondre(Humain correspondant) {
    	correspondant.direBonjour();
    }
    
    public void memoriser(Humain correspondant) {
		if (memoire[taille-1] != null) {
			memoire[0] = null;
			for(int j = 0; j<taille-1;j++) {
				Humain a = memoire[j+1];
				memoire[j] = a;
			}
			memoire[taille-1] = correspondant;
		}
		else {
    	for(int i = 0; i<taille; i++) {
    		if (memoire[i]==null) {
    			memoire[i] = correspondant;
    			break;
    		}

    		}
    	}
    }
    
    public void faireConnaissance(Humain nouveau) {
    	this.direBonjour();
    	this.repondre(nouveau);
    	nouveau.memoriser(this);
    	this.memoriser(nouveau);
    }
    
    public void listerConnaissances() {
    	String a = memoire[0].getNom();
    	for(int i = 1; i< taille; i++) {
    		if(memoire[i] != null) {
    			String b = memoire[i].getNom();
    			a = a+", "+b;
    		}
    		
    	}
    	parler("Je connais beaucoup de monde dont : "+a);
    }
    
    
    
}
