package Forme;

class Cercle extends Forme {
	private double rayon;
	public Cercle(double x, double y, double rayon)
	{
		super(x,y);
		this.rayon=rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public double perimetre()
	{
		return 2*Math.PI*rayon;
	}
	
	public double surface()
	{
		return Math.PI*rayon*rayon;
	}
	
	
	
}


