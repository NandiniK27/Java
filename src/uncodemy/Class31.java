package uncodemy;
public class Class31
{
   public static void main(String[] args)
    {
	stop1:
	  for(int x=0; x < 5; x++)
	   {
		for( int y = 0; y < 5; y++)
		{  
			if(y == 2)
			break stop1;
		System.out.println("x and y: " + x + " " + y);
		}
   }
		System.out.println();
		for(int x=0; x < 5; x++)
	stop2:
		
	  for(int y = 0; y < 5; y++)
		{ 
		   if(y == 2) 
		   break stop2;
		System.out.println("x and y: " + x + " " + y);
		}
	}
}
