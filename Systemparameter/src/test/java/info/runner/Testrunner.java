
package info.runner;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",tags=("@Settings"),monochrome = true, dryRun = false, glue = "info.pages" 
)
public class Testrunner {
	
	@AfterClass
	public static void SendingMail() throws AddressException, IOException, MessagingException{
		
		Runtime r=Runtime.getRuntime();  	  
		r.addShutdownHook(new Thread(){  
		public void run(){  
			Mailing sm = new Mailing();
			try {
				sm.mail();
				System.out.println("Report has been sent"); 
			} catch (IOException | MessagingException e) {
				e.printStackTrace();
			}
			
		    }  
		}  
		);  
		try{Thread.sleep(5000);}catch (Exception e) 
		{
			System.out.println(e);
		}  
		
		
		}
}
	
	
	


	

	

	