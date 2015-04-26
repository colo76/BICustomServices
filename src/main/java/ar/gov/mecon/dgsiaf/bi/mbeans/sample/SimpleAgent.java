package ar.gov.mecon.dgsiaf.bi.mbeans.sample;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class SimpleAgent {

	private MBeanServer mbs = null;

	public SimpleAgent() {
		super();
		mbs = ManagementFactory.getPlatformMBeanServer();
		// Unique identification of MBeans
		Hello helloBean = new Hello();
		ObjectName helloName = null;
		try {
			helloName = new ObjectName("Colo:name=HelloBean");
			mbs.registerMBean(helloBean, helloName);
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		} catch (InstanceAlreadyExistsException e) {
			e.printStackTrace();
		} catch (MBeanRegistrationException e) {
			e.printStackTrace();
		} catch (NotCompliantMBeanException e) {
			e.printStackTrace();
		}

	}
	
	// Utility method: so that the application continues to run
	   private static void waitForEnterPressed() {
	      try {
	         System.out.println("Press  to continue...");

	         System.in.read();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	    }

	public static void main(String[] args) {
	      SimpleAgent agent = new SimpleAgent();
	      System.out.println("SimpleAgent is running...");
	      SimpleAgent.waitForEnterPressed();
	}
}
