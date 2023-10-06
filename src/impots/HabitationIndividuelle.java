package impots;

public class HabitationIndividuelle extends Habitation{

	protected int nbPiece;
	
	protected boolean piscine;
	
	public HabitationIndividuelle(String proprietaire, String adresse, double surface, 
			int nbPiece, boolean piscine) {
		super(proprietaire, adresse, surface);
		this.nbPiece = nbPiece;
		this.piscine = piscine;
	}
	
	public double impot() {
		double piscineTaxe = 0;
		if(this.piscine) {
			piscineTaxe = 500;
		}
		return 2*surface + 100*nbPiece + piscineTaxe;
	}
	
	public void affiche() {
		String presencePiscine = "";
		if(this.piscine) {
			presencePiscine = " et une piscine";
		}
		super.affiche();
		System.out.println(" contenant "+nbPiece+" pieces"+presencePiscine);
	}
}
