package Forme;
import java.awt.*;

public class DessinerCercle  extends Cercle implements Dessiner {
public DessinerCercle(double x, double y, double rayon) {
		super(x, y, rayon);
		
	}

public void afficher(Graphics g)
{
g.setColor(Color.RED);		
g.drawOval((int) this.getX(), (int) this.getY(), (int) this.getRayon(), (int) this.getRayon());

}

}
