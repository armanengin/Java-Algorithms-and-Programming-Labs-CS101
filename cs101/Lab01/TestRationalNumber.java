public class TestRationalNumber
{
  public static void main( String[] args )
  {
    
    RationalNumber x;
    RationalNumber y;
    RationalNumber z;
    RationalNumber a;
    RationalNumber b;
    RationalNumber c;
    
    
    x = new RationalNumber( 2, 20 );
    y = new RationalNumber( -3, 30 );
    a = new RationalNumber( 7, 27 );
    b = new RationalNumber( 50, 6 );
    c = new RationalNumber( 9, 3 );
    
    
    z = x.add( y );
    System.out.println( x + " + " + y + " = " + z );
    
    z = x.multiply( y );
    System.out.println( x + " x " + y + " = " + z );
    
    z = x.divide( y );
    System.out.println( x + " / " + y + " = " + z );
    
    z = a.divide( b );
    System.out.println( a + " / " + b + " = " + z );
    
    z = c.reciprocal( );
    System.out.println( "reciprocal c = " + z );
    
  }
}
