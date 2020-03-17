package Ex3;
public class EntNat {
private int n;
public EntNat (int n) throws ErrConst
{ 
if (n<0) throw new ErrConst(n) ;
this.n = n ;
}
public int getN () { 
	return n ; }
public static EntNat somme (EntNat n1, EntNat n2) throws ErrSom, ErrConst{
int op1 = n1.n, op2 = n2.n ;
long s = (long)op1 + (long)op2 ;
if (s > Integer.MAX_VALUE) throw new ErrSom (op1, op2) ;
return new EntNat(op1+op2) ;
}
public static EntNat diff (EntNat n1, EntNat n2) throws ErrDiff, ErrConst
{ int op1 = n1.n, op2 = n2.n ;
int d = op1 - op2 ; 
if (d<0) 
throw new ErrDiff(op1, op2) ;
EntNat res = new EntNat (d) ;
return res ;
}
public static EntNat prod (EntNat n1, EntNat n2) throws ErrProd, ErrConst
{ int op1 = n1.n, op2 = n2.n ;
long p = (long)op1*(long)op2 ;
if (p > Integer.MAX_VALUE) 
throw new ErrProd(op1, op2) ;
return new EntNat ((int)p) ;
}
}
