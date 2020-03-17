package Forme;
import java.awt.*;


public class Main {

	public static void main(String[] args) {
		
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400,400));
		Dessiner[] F=new Dessiner[4];
		F[0]= new DessinerCercle(160,160,80);
		F[1]= new DessinerCercle(1,2,80);
		F[2]= new DessinerRectangle(20,10,80,100);
		F[3]= new DessinerRectangle(30,40,80,100);
		
		for(int i=0;i<F.length;i++)
	        {
	        	jc.addDrawable(F[i]);
	        }
	
		for(int i=0;i<F.length;i++)
	        {
	       	((Forme)F[i]).deplacer(100, 100);;
	      	
	        }
		for(int i=0;i<F.length;i++)
        {
		
        	jc.removeDrawable(F[i]);
        
        }
		GUIHelper.showOnFrame(jc,"Dessin");
       
}
}