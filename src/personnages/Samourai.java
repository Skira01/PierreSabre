package personnages;

public class Samourai extends Ronin{
	String seigneur;
	
	public Samourai(String nom,String boissonPreferee, int qttArgent, String seigneur) {
		super(nom,boissonPreferee,qttArgent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler("Je suis fier de servir le seigneur"+seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est ce que je vais choisir comme boisson ? Tient, je vais prendre du "+boisson);
		this.boissonPreferee = boisson;
		super.boire();
	}
}
