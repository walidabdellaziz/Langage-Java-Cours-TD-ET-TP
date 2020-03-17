package test1;

public class PointNom3D extends Point3D {
	private char nom;
public PointNom3D(double x, double y, double z, char nom)
{
	super(x,y,z);
	this.setNom(nom);
}
public char getNom() {
	return nom;
}
public void setNom(char nom) {
	this.nom = nom;
}
public void affCoord () {
System.out.println("Nom :"+this.nom+" Coordonnées : "+ "x= "+this.getX()+"y= "+this.getY()+"z= "+this.getZ()) ; 
}
}
