package Forme;

import java.awt.Color;
import java.awt.Graphics;

public class DessinerRectangle extends Rectangle implements Dessiner {
	
public DessinerRectangle(double x, double y, double largeur, double longueur) {
		super(x, y,largeur,longueur);
		// TODO Auto-generated constructor stub
	}

public void afficher(Graphics g)
{
	
g.setColor(Color.BLUE);	
g.drawRect((int) this.getX(), (int) this.getY(), (int) this.getLargeur(), (int) this.getLongueur());
}

}
