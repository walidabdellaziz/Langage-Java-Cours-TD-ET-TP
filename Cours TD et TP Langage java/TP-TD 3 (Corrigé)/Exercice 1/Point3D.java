package test1;

class Point3D {
private double x,y,z ; 
public Point3D(double x, double y, double z) { 
this.x=x ;
this.y=y ; 
this.z=z ;}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double getZ() {
	return z;
}

public void setZ(double z) {
	this.z = z;
}

public void affCoord () {
System.out.println( "Coordonnées : "+ "x= "+x+"y= "+y+"z= "+z) ; }
}



