package GestionVehicules;

class Vehicule {

		private String marque;
		private int dateAchat;
		private double prixAchat;
		private double prixCourant;

		public Vehicule(String marque, int date, double prix) {
			this.marque = marque;
			dateAchat = date;
			prixAchat = prix;
			prixCourant = prix;
		}

		public void calculePrix(int anneActuelle) {
			double decote = (anneActuelle - dateAchat) * 0.01;
			prixCourant = Math.max(0.0, (1.0 - decote) * prixAchat);
		}

		public void affiche() {
			System.out.print("marque : " + marque +
					", date d'achat : " + dateAchat +
					", prix actuel : " + prixCourant);
			System.out.println();
		}
	  public int getDateAchat(){
	    return dateAchat;
	  }
	  public String getMarque(){
	    return marque;
	  }
	  public double getPrixAchat(){
	    return prixAchat;
	  }
	  public void setPrixCourant(double prix){
	    prixCourant = prix;
	  }

	}


