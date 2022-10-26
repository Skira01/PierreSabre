package personnages;

public class Commercant extends Humain{


	public Commercant(String nom, int qttArgent) {
		super(nom,"du thé",qttArgent);
	}
	
	public int seFaireExtorquer() {
		qttArgent = 0;
		parler("J'ai tout perdu! Le monde est vraiment trop injuste...");
		return qttArgent;
	}
	
	public void recevoir(int monnaie) {
		
		qttArgent += monnaie;
		parler(monnaie+" sous! Je te remmercie généreux donnateur!");
		
		
	}
	
}
