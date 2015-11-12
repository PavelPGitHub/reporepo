public class Fraction {
///////////////////////////////////////////////////////////	
  Fraction(int num, int dec)
  {
	  n = num;
	  d = dec;
  }
///////////////////////////////////////////////////////////	
  public int n,d;
///////////////////////////////////////////////////////////	 
  public String toString()

  {
      return n+"/"+d;
  }
///////////////////////////////////////////////////////////
  private Fraction Sokr(Fraction y)
  {
	  int f=0;
	  int c;
	  if (n<0)
		{
			n=Math.abs(n);
			f++;
		}
		if (d<0)
		{
			d=Math.abs(d);
			f++;
		}
		if (n>d)
		{
			c=d;
		} else
		{
			c=n;
		}
		for (int i=c;i>1;i--)
		{
			if ((n%i==0)&&(d%i==0))
			{
				n=n/i;
				d=d/i;
			}
		}
	  return y;
  }
///////////////////////////////////////////////////////////
  public Fraction div(Fraction x)
  {
	  Fraction y = new Fraction(n*x.d,d*x.n);
	  y.Sokr(y);
	  return y;
  }
///////////////////////////////////////////////////////////	  
  public Fraction mul(Fraction x)
  {
	  Fraction y = new Fraction(n * x.n,d * x.d);
  y.Sokr(y);
	  return y;
  }
///////////////////////////////////////////////////////////	  
  public Fraction sum(Fraction f)
  {
	  Fraction y = new Fraction(n*f.d+d*f.n,d*f.d);
	  y.Sokr(y);
	  return y ;
  }
///////////////////////////////////////////////////////////	
  public Fraction minus(Fraction f)
  {
	  Fraction y = new Fraction(n*f.d-d*f.n,d*f.d);
	  y.Sokr(y);
	  return y ;
  } 
///////////////////////////////////////////////////////////
  public String equal( Fraction f)
  {	  
	  double y1 = (double)n/d;
	  double y2 = (double)f.n/f.d;	  
	  if (y1>y2)
	  {
	      return n+"/"+d+">"+f.n+"/"+f.d;
	  } else if (y1<y2)
	  {
		  return n+"/"+d+"<"+f.n+"/"+f.d;
	  } else {
		  return n+"/"+d+"="+f.n+"/"+f.d;
	  }
  }
///////////////////////////////////////////////////////////	
}