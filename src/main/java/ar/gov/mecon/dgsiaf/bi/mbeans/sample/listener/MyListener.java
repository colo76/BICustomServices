package ar.gov.mecon.dgsiaf.bi.mbeans.sample.listener;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ar.gov.mecon.dgsiaf.bi.mbeans.sample.Hello;
import ar.gov.mecon.dgsiaf.bi.mbeans.sample.SimpleAgent;

public class MyListener implements ServletContextListener {

	private MBeanServer mbs = null;
	
	

	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		mbs = ManagementFactory.getPlatformMBeanServer();
		// Unique identification of MBeans
		Hello helloBean = new Hello();
		ObjectName helloName = null;
		try {
			helloName = new ObjectName("com.colo:name=HelloBean,Type=weblogic.management.mbeanservers.domainruntime.DomainRuntimeServiceMBean");
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

}
