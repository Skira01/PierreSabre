package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int qttArgent,String clan, int reputation ) {
		super(nom,boissonPreferee,qttArgent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.getQttArgent();
		qttArgent = gagnerArgent(gain);
		victime.seFaireExtorquer();
		parler("J’ai piqué les "+gain+" sous de"+victime.getNom()+", ce qui me fait "+qttArgent+" sous dans ma poche. Hi ! Hi !");
		reputation += 1;
	}
	
	public void perdre(Ronin gagnant) {
		reputation -= 1;
		gagnant.qttArgent = gagnerArgent(qttArgent);
		parler("J'ai perdu mon duel et mes "+qttArgent+" sous, snif... J'ai désonhoré le clan de "+clan);
		qttArgent = 0;
	}
	
	public void gain(Ronin perdant) {
		int qttGain = perdant.getQttArgent();
		qttArgent = gagnerArgent(qttGain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre "+nom+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+qttGain+" sous.");
	}
	

	
}
