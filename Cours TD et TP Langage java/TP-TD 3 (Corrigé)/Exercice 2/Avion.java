package GestionVehicules;

class Avion extends Vehicule {
	
	private String moteur;
	private int heuresVol;

	public Avion(String marque, int date, double prix, String moteur, int heures) {
		super(marque, date, prix);
		this.moteur = moteur;
		heuresVol = heures;
	}

	public void calculePrix(int anneActuelle) {
		double decote;
		if (moteur == "HELICES") {
			decote = 0.1 * heuresVol / 100.0;
		} else {
			decote = 0.1 * heuresVol / 1000.0;
		}

		setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
	}

	public void affiche() {
		System.out.println(" ---- Avion à  " + moteur + "----");
		super.affiche();
		System.out.println(heuresVol + " heures de vol.");
	}

}