package impots;

public class DemoImpots {

	public static void main(String[] args) {

		Habitation h = new Habitation("moi", "1 rue du puit", 50.0);
//		h.affiche();		
//		System.out.println("impots : "+h.impot());
		
		HabitationIndividuelle hi1 = new HabitationIndividuelle("remi", "160 rue Roger Salengro", 40.0, 2, false);
//		hi1.affiche();		
//		System.out.println("impots : "+hi1.impot());
		
		HabitationIndividuelle hi2 = new HabitationIndividuelle("catherine", "24 rue Marcel Rosey", 1000.0, 8, true);
//		hi2.affiche();		
//		System.out.println("impots : "+hi2.impot());
		
		HabitationProfessionnelle hp1 = new HabitationProfessionnelle("pascal", "zone indus", 2000, 15);
//		hp1.affiche();
//		System.out.println("impots : "+hp1.impot());
		
		Habitation[] commune = new Habitation[3];
		commune[0] = hi1;
		commune[1] = hi2;
		commune[2] = hp1;
		double total = 0;
		for(int i=0; i<commune.length; i++) {
			System.out.println(commune[i].impot());
			total += commune[i].impot();
		}
		System.out.println("total "+total);
	}

}
