package Forme;
class Rectangle extends Forme {
private	double longueur;
private	double largeur;
public Rectangle(double x, double y, double largeur, double longueur)
{
	super(x,y);
	this.largeur=largeur;
	this.longueur=longueur;}
public double getLongueur() {
	return longueur;}


public double getLargeur() {
	return largeur;}

public double perimetre()
	{
		return 2*(longueur+largeur);
	}
public double surface()
{
	return longueur*largeur;
}

}
