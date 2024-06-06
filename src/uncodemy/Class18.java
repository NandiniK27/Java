package uncodemy;
public class Class18

{
   public static void main(String[] args)
	{
		int result;
		
		for(int i = -5; i < 6; i++)
		{ 
			result = i != 0 ? 100 / i : 0;    //ternary operation 
		    
			if(i != 0)      //comment this line and execute for practice
		
		    System.out.println("100 / " + i + " is " + result);
		}
		
	}

}
