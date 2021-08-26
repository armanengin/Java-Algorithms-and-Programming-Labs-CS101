/**
 * a program stimulates the rational numbers.
 * @author Arman Engin SUCU
 * @version 11.05.2020
 */
public class RationalNumber{
  //properties
  private int n;
  private int d;
  
  //constructor
  public RationalNumber(int n , int d){
    this.n = n / gcd( n , d );
    this.d = d / gcd(n , d);
  }
  
  //methods
  private int gcd(int n, int d){
    int absN = Math.abs(n);
    int absD = Math.abs(d);
    int min;
    int other;
    int gcd = 1;
    if( absN < d){
      min = absN;
      other = absD;
    }
    else if( d < absN){ 
      min = absD;
      other = absN;
    }
    else{
      return absN;
    }
    if(min == 0){
      return other;
    }
    for(int i = 2 ; i <= min ; i++){
      while(((min/i)*i == min) && ((other/i)*i == other)){
        gcd *=i;
        min = min/i;
      }
    }
    return gcd;
  }
  /**
   * This method add two rational numbers
   * @param a is another rational number 
   * @return the sum.
   */
  public RationalNumber add(RationalNumber a){
    RationalNumber sum = new RationalNumber(this.n *a.d + this.d * a.n  , this.d * a.d);
    return sum;
  }
  
  /**
   * This method subtract two rational numbers
   * @param a is another rational number 
   * @return the difference.
   */
  public RationalNumber subtraction(RationalNumber a){
    RationalNumber diff = new RationalNumber(this.n * a.d - this.d * a.n  , this.d * a.d);
    return diff;
  }
  
  /**
   * This method multiply two rational numbers
   * @param a is another rational number 
   * @return the product.
   */
  public RationalNumber multiply(RationalNumber a){
    RationalNumber product = new RationalNumber(this.n * a.n  , this.d * a.d);
    return product;
  }
  
  /**
   * This method divide two rational numbers
   * @param a is another rational number 
   * @return the quotient.
   */
  public RationalNumber divide(RationalNumber a){
    RationalNumber quotient = new RationalNumber(this.n * a.d  , this.d * a.n);
    return quotient;
  }
  
  /**
   * @return returns reciprocal of the rational numbers
   */
  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber( this.d , this.n);
    return reciprocal;
  }
  
  /**
   * This method controls if the number is integer. 
   * @returns true or false.
   */
  public boolean isInteger(){
    if(isZero()){
      return true;
    }
    if(((this.n/this.d) * this.d) == this.n){
      return true;
    }    
    else{
      return false;
    }
  }
  
  /**
   * This method controls if the number is zero. 
   * @return returns true or false.
   */
  public boolean isZero(){
    return this.n == 0;
  }
  
  /**
   * This method compares two rational numbers in term of the size.
   * @param other is the other rational number. 
   * @return returns true or false.
   */ 
  public boolean isLessThan( RationalNumber other ){
    if(subtraction(other).n < 0){
      return true;
    }
    else
      return false;
  } 
  
  /**
   * This method checks if the rational numbers are equal.
   * @param other is the other rational number. 
   * @return returns true or false.
   */ 
  public boolean equals( RationalNumber other ){
    if((this.n == other.n) && (this.d == other.d)){
      return true;
    }
    else 
      return false;
  }
  
  //toString method
  public String toString(){
    return this.n + "/" + this.d;
  }
}  