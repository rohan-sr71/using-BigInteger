import java.util.*;
import java.math.*;

class Hello 
{
	
  public static void main(String[] args)
	{
	  BigInteger b1,b2,b3;
	  Scanner sc=new Scanner(System.in);
	  b1=sc.nextBigInteger();
	  b2=sc.nextBigInteger();
	  System.out.println("1. ADD 2.MULTIPLY 3.SUBTRACT 4.DIVIDE");
	  int ch=sc.nextInt();
	  switch(ch)
	  {
	  case 1: b3=b1.add(b2);
	          System.out.println(b3);
	          break;
	  case 2: b3=b1.multiply(b2);
	          System.out.print(b3);
	          break;
	  case 3: b3=b1.subtract(b2);
              System.out.println(b3);
              break;
	  case 4: b3=b1.divide(b2);
              System.out.println(b3);
              break;
      default: System.out.println("select valid options");
	  }
	}
}
