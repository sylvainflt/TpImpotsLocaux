package impots;

public class HabitationProfessionnelle extends Habitation {

	protected int nbEmployes;

	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmployes) {
		super(proprietaire, adresse, surface);
		this.nbEmployes = nbEmployes;
	}
	
	public double impot() {
		
		return 2*surface + 1000*(nbEmployes/10);
	}
	
	public void affiche() {
		
		super.affiche();
		System.out.println(" contenant "+nbEmployes+" employés");
	}
	
}
