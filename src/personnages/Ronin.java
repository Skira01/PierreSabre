package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom,String boissonPreferee, int qttArgent) {
		super(nom,boissonPreferee,qttArgent);
	}
	
	public void donner(Commercant benneficiaire) {
		int don = (10/100)*qttArgent;
		parler(benneficiaire.getNom()+" prends ces "+don+" sous.");
		benneficiaire.recevoir(don);
		qttArgent -= don;
	}
}
