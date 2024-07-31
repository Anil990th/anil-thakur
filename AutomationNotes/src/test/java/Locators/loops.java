package Locators;

public class loops {

	public static void main(String[] args)
	{
		loops F = new loops();
		F.forLopp();
		
		F.whileloop();

	}
	
	public void whileloop() 
	{
		int i = 0;    // initialization 
		while(i<5)    // condition 
		{
			System.out.println("While loop it should print 5 times");
			i++; // increment
			
		}
		
	}
	

	
	public void  forLopp() 
	
	
	{
		 		for (int A = 0; A<5; A= A+1)      
		 		{
		 			System.out.println(" 5 times it should be printed");
		 		}
		
		
		// Explanation = 
		// Line no 26 - In this line inat A = 0 is  initiliazing process
		// A < 5 break point when the loop will end .
		// A+1 means first int A = 0 which is leass than 5 condition pass =      printed ***one time***                 1
		// then A+1 means incremented by 1 so now 0 becomes 1 which is leass than 5 = printed ****second time****        2
		// then A+1 neans incremented by 1 so 1 now becomes 2 which is less than 5 =  printed **** third time****        3
		//              "                            becomes 3 which is less than 5 = "  **** printed forth time         4
		//                                           becomes 4 which is less than 5 = ******* printed 5th time***        5
		 		 //              becomes 5 which is not less than 5 condition fails  = ??*** printing stopped ??***
	}   
	
	

   }
  

  ///////// Try to compare them with live examples ///////
////////// if not then try to use them in swan app/////// try to use these loops in Calendarhandle class for clicking on calendar year