package Forme;

public class Maintp4 {

	public static void main(String[] args) { 
		
		Forme[] formes = new Forme[4];
		
		formes[0]=new Rectangle(100,150,50,75);
		formes[1]=new Rectangle(100,250,250,100);
		formes[2]=new Cercle(0,0,100);
		formes[3]=new Cercle(150,0,150);
		

			double SP=0,SS=0;

		for (int i = 0; i < formes.length; i++) {
			SP+=formes[i].perimetre();
			SS+=formes[i].surface();
		}
		System.out.print("--- LA SOMME DES PERIMETRES : "+SP+" m\n--- LA SOMME DES SURFACES : "+SS+" m²");
	}

}
