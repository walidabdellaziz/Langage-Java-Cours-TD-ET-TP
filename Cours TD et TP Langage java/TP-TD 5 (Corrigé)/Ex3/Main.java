package Ex3;

public class Main {

	public static void main(String[] args)  {
		
		try
		{ EntNat n1 = new EntNat(20);
		  EntNat n2 = new EntNat(12) ;
		EntNat d ;
		d = EntNat.diff (n1, n2) ;
		d = EntNat.diff (n2, n1) ;
		}
		catch (ErrNat e)
		{ System.out.println ("*** erreur Entier naturel ****") ;
		}
		try
		{ EntNat n3 = new EntNat (2000000000), n4 = new EntNat (2000000000) ;
		EntNat d = EntNat.diff (n3, n4) ;
		EntNat s = EntNat.somme (n3, n4) ;
		EntNat p = EntNat.prod (n3, n4) ;
		}
		catch (ErrConst e)
		{ System.out.println ("*** erreur construction EntNat avec argument "
		+ e.getN()) ;
		}
		catch (ErrDiff e)
		{ System.out.println ("*** erreur difference EntNat - valeurs "
		+ e.getN1() + " " + e.getN2()) ;
		}
		catch (ErrSom e)
		{ System.out.println ("*** erreur somme EntNat - valeurs "
		+ e.getN1()+" "+ e.getN2()) ;
		}
		catch (ErrProd e)
		{ System.out.println ("*** erreur produit EntNat - valeurs "
		+ e.getN1() + " " + e.getN2()) ;
		}
	}

}
