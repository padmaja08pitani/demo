package Pakage_3;

public class test {

	
		public static void main(String[] args)
		{
			int x=5;
			int y=x++;
			
			int z = ++y;
			
			System.out.println(y);
			
			System.out.println("The Value of z is:-" +z);
			
		    test obj=new test();
		    obj.sub();
		    
			
		}
		
		public  void sub()
		{
		    int i , j , k = 0;
		    j = k++; // Value of j is 0
		    i = ++j; // Value of i becomes 1
		    k = i++; // Value of k is 1
		    System.out.println(k);  
		}
	}


