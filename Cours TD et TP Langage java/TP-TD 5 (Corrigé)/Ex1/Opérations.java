package Ex1;

public final class Opérations
{
public static double division ( double p, double q)
{
	if (q==0)
			throw new ArithmeticException("Division par zéro");
 return p / q;
}
public static double somme( double p, double q)
{
 return p+q;
}
}

