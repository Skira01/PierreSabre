package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int qttArgent,String clan) {
		super(nom,boissonPreferee,qttArgent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		qttArgent += victime.getQttArgent();
		victime.seFaireExtorquer();
		parler("J’ai piqué les 15 sous de"+victime.getNom()+", ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
		reputation += 1;
	}

	
}
