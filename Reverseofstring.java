package ja;

public class Reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To reverse the string
     
		//reversestring1.method1(); // By using array converter
		reversestring1.method2(); // By using stringbuffer
		
	}
	
		public static class reversestring1 {
			public static void method1()
			{
		
				// 
				String str = "Vishwadeep       peedawhsiV             ";
				char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
				for(int i= chars.length-1; i>=0; i--) {
					System.out.print(chars[i]);
				}
			}
	
			public static void method2() {
				String str = "I am Software Tester.               .retseT erawtfoS ma I ";
				int i = str.length();      // calculating total length of the string
				StringBuffer strb = new StringBuffer();
				for( int j=i-1; j>=0; j--)
				{
					strb = strb.append(str.charAt(j));
				}
				System.out.println(strb);
			}
		}
	
		public static class reverseno{
			public void rmethod1() {
				
				
				
				
			}
			
			
			
			
		}
		
		
	}


   class Armstrongnumber   //Program of Armstrong number
{

public static void main (String args[])
  {
   int num =153;
   int rev=num;
   int r=0;
   int cube=0;
   
 while (num>0)
  { 
   int r=num%10;
      num=num/10;
      cube=(r*r*r)+cube;
   
      if(num==rev)
           {
             System.out.println("number is armstrong"+rev);
            }
       else
            {
             System.out.println("number is not armstrong");
             }
     }
  }
}
