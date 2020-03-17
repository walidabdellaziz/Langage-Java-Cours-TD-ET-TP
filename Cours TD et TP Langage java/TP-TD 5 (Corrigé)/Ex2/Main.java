package Ex2;


public class Main {

	public static void main(String[] args) {
		try
		{ EntNat n1 = new EntNat(20);
		  EntNat n2 = new EntNat(-12) ;
		}
		catch (ErrConst e)
		{ System.out.println ("*** erreur Entier naturel **** : "+e.getN()) ;
		}
	}

}
