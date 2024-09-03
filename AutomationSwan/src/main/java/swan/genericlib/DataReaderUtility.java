package swan.genericlib;                       

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReaderUtility
{                       
	
	public List<HashMap<String,String>> getJsonDataToHashmap(String filepath) throws IOException
	{
		 // Read Json to String -- Here json fromat will be converted to String so that its understandable while executing the test
	String JsonContent =	FileUtils.readFileToString(new File (filepath),StandardCharsets.UTF_8);
	
	// String toi Hashmap -- Now we will map the data to Hashmap 
	ObjectMapper mapper = new ObjectMapper(); //This class we need to map the data to hashmap  // dont forgot to add the dependencies of jackson databing and import them
	List<HashMap<String, String>> data = mapper.readValue(JsonContent, new TypeReference<List<HashMap<String, String>>>(){});   // this line video no 173 17:25
	return data;       // Line no 24 to 25 video no 173 from 8.02 seconds 
	
	
//	Line no 24 - mapper.readValue this methos will read the value and convert it ti hashmap 
// Line no 24 - the method expects two arguments first the String which you want to convert to the hashmp so that is this - JsonContent,	
	// continuation of above and the second argument is how you want to convert so in this case we are telling to create hashmap based no number of indexes we have in the json file .
	// and all hashmaps put them in a list and then  Line no 25 we are telling this method to return THAT LIST.
	
	
	// SO line no 24 this object which is "data" contains list of data .
	
	
	//Line no 20 -StandardCharsets.UTF_8 - this is the encoding format so  this format is used for String.
	
	}
	
	
	
	
	

}