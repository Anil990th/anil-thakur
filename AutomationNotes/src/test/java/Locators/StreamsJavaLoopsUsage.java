package Locators;

import java.util.ArrayList;                       //VIDEO NO 115)////******
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsJavaLoopsUsage                     // this is how to use loops for different thing like aggregation

{  
	@Test
	public void Generalmethod() 
	{
		
	ArrayList<String> name = new ArrayList<String>();    // Creating a array list
	
	name.add("Ambani");                                  // adding data into array list using .add methjod of arrtay list
	name.add("Ambika");
	name.add("Ambuja");
	name.add("Abhijeet");
	name.add("Payal");
	int count = 0;
	
	for(int i=0;i<name.size();i++)
	{
		String actualcount = name.get(i);                // Here whats happening is by the help of names.get(i) we are fetching the names which 
		if(actualcount.startsWith("A"))                  // will get store in i while executing for loop and by .get method method of array list we are 
                                                           // extracting them . and then with if methoid we are checking whether it starts with a ornot 
		{                                                 // dont forgot to store line no 24 in string only then you can get .starts with method.
			count++;
		}
		
		
	}                                                    
	  System.out.println(count);
	
    }

	  @Test                              ///// Hwo to do same abpove thing using streams of java /////
	public void streamFilter() 
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ambani");                                
		name.add("Ambika");
		name.add("Ambuja");
		name.add("Abhijeet");
		name.add("Payal");
		                                        // nOTE NOTHING WILL HAPPEN WITHOUT .COUNT                                                   /// VIDEO NO 115////////////////
	Long L =-name.stream().filter(s->s.startsWith("A")).count();                                       // name.stream changing ARRAY to stream after that lamda expression 
		System.out.println(L);
		              
		Stream.of("Ambani","Ambika","Ambuja","Abhijeet","Payal");          // This how you can directly make a stream without using arrat list 
		
	Long L2 =	 Stream.of("Ambani","Ambika","Ambuja","Abhijeet","Payal").filter(s->s.startsWith("A")).count();        //Then can perform actions driectly like this -
	
	       System.out.println(L2);
	}
	
	
              // This is the one generally used method of streams explained above for more methods / types 	
	          // of streams watch video no 115.
	                       // some of the examples are like - get the names > than length 4 
	                                                          // get the names > than 4 and with uipper case .
	  
	  
}                                              
