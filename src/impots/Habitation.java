package impots;

public class Habitation {

	protected String proprietaire;
	
	protected String adresse;
	
	protected double surface;

	public Habitation(String proprietaire, String adresse, double surface) {
		super();
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	public double impot() {
		return 2*surface;
	}
	
	public void affiche() {
		System.out.println(proprietaire+" possède "+adresse+" d'une surface de "+surface);
	}
	
}
