package Forme;
public abstract class Forme  {
private double x;
private double y;
public void deplacer(double x,double y)
{
	this.x+=x;
	this.y+=y;
}
public Forme(double x, double y)
{
	this.x=x;
	this.y=y;
}

public double getX() {
	return x;
}
public double getY() {
	return y;
}
public abstract double surface();
public abstract double perimetre();
}


