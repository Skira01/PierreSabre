package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom,String boissonPreferee, int qttArgent) {
		super(nom,boissonPreferee,qttArgent);
	}
	
	public void donner(Commercant benneficiaire) {
		
		double sommedon = ((double)10 / 100)*qttArgent;
		int don = (int) sommedon;
		parler(benneficiaire.getNom()+" prends ces "+don+" sous.");
		benneficiaire.recevoir(don);
		qttArgent -= don;
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		int repAdv = adversaire.getReputation();
		if (force >= repAdv) {
			honneur += 1;
			parler("Je t'ai eu petit yakuza");
			adversaire.perdre(this);
		}
		else {
			honneur -= 1;
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gain(this);
			
		}
	}
	
}
