package uncodemy;
public class Class32
{
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//outer loop:
			for(int i=1; i < 10; i++)
		{
				System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
			for(int j = 1; j < 10; j++)
			{ 
				 if(j == 5) continue;// outer loop; 
			     System.out.print(j);
			}
		}
	}
}
