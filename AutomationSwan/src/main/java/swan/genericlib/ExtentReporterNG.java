package swan.genericlib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG 

{
	public static ExtentReports getReportObject() 
	{   
		//   ExtentReports, EctentSparkReporter ;;; These two classes are required to use the extent reports 
		// So we need to create object of these two classes so that we can use the methods present inside them.
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
	    ExtentSparkReporter reporter = new  ExtentSparkReporter(path);  // Creating an object of Extentspark reportes and with this object we can se report configurations like report file name , tester name etc. ,
	                                                                      //  this class need A PATH where the reposts should be created thats why we werote LINE NO 14;
	    reporter.config().setReportName("Swan Automation Test Results"); // Steiing up report file name 
	    reporter.config().setDocumentTitle("Automation Testing");       // Setting up  documentTile name 
	    
	   ExtentReports  ex = new ExtentReports();   // Creating onject of ExtentReports class, this is the main class responsible to drive all the reporting execution 
	   ex.attachReporter(reporter);   // attaching object of the extentSparkreporter class so that this class have all the knowledge of basic configurations
	   ex.setSystemInfo("Tester","Anil Thakur");                      // Setting up tester name 
	   return ex;
	
	}
	
	
	
	
}
