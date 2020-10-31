
public class Fraction implements Addable, Comparable {
private int num, denom;
	
	public Fraction (int n, int d) {
		num = n;
		denom = d;
		if (num == 0) {
			denom = 1;
		}
		if (denom == 0 && num != 0) {
			num = 1;
			denom = 2;
		}
		if (num > 0 && denom < 0) {
			num = ~(num-1);
			denom = Math.abs(denom);
		}
		if (num < 0 && denom <0) {
			num = Math.abs(num);
			denom = Math.abs(denom);
		}
		int gcd = gcd(num, denom);
		num = num/gcd;
		denom = denom/gcd;
	}
	
	public String toString() {
		return num + "/" + denom;
	}
	
	public int compareTo(Object other) {
	    Fraction fraction = (Fraction) other;
	    if (value() > fraction.value()) {
	    	return 1;
	    }
	    else
	    	return -1;
	}
	
	public Addable add(Fraction f) {
		num = num * f.denom + f.num * denom;
		denom = denom * f.denom;
		return new Fraction (num, denom);
	}
	
  private static int gcd(int a, int b) {

    if(a == 0 || b == 0) return a+b; // base case

    return gcd(b,a%b);
  }
  
  public double value() {
	  return (double)num/denom;
  }
  
  public void square() {
	  num = num * num;
	  denom = denom * denom;
  }
  
  public Fraction copy() {
	  Fraction copy;
	  copy = new Fraction(num, denom);
	  return copy;
  }
  
  int temp;
  public Fraction inverse() {
	  Fraction inverse;
	  inverse = new Fraction(num, denom);
	  temp = num;
	  num = denom;
	  denom = temp;
	  return inverse;
  }
}
