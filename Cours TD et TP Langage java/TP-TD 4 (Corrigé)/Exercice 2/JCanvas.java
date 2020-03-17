package Forme;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;
public class JCanvas extends JPanel {
	
		private List<Dessiner> drawables = new LinkedList<Dessiner>();
		
		public void paint(Graphics g) {
			super.paint(g);
			for (Iterator<Dessiner> iter = drawables.iterator(); iter.hasNext();) {
				Dessiner d = iter.next();
				d.afficher(g);	
			}
		}

		public void addDrawable(Dessiner d) {
			drawables.add(d);
			repaint();
		}

		public void removeDrawable(Dessiner d) {
			drawables.remove(d);
			repaint();
		}

		public void clear() {
			drawables.clear();
			repaint();
		}
		
	
}
