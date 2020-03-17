package Ex1;
import java.util.InputMismatchException;
import java.util.Scanner; 
public class Main
{ 
	public static void main(String[] args) 
	{ 
double a, b, res; 
try {
	Scanner clavier = new Scanner(System.in); 
	System.out.println("Enter le premier opérande");
	a = clavier.nextDouble(); 
	System.out.println("Enter le deuxième opérande");
	b = clavier.nextDouble(); 
	res = Opérations.division(a, b);
	System.out.println("le résultat de la division est :"+res);
	
}
catch (ArithmeticException e )
{
	System.out.println(e.getMessage());
}
catch (InputMismatchException e )
{
	System.out.println("veuillez saisir un réel");
}



	}	
}
