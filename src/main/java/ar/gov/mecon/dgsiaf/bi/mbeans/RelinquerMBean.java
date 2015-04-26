package ar.gov.mecon.dgsiaf.bi.mbeans;

import org.apache.log4j.Logger;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "com.colo:name=relinquerbean,Type=weblogic.management.mbeanservers.domainruntime.DomainRuntimeServiceMBean)", description = "Relinquer Bean", logFile = "relinquer.log")
public class RelinquerMBean implements IRelinquerMbean {

	private boolean enabled;

	private Logger LOGGER = Logger.getLogger(RelinquerMBean.class);

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@ManagedOperation(description = "Relinq")
	public void testRelinquerMbean() {
		LOGGER.info("Invocando testRelinquerMbean");

	}

	@ManagedAttribute(description = "enabled")
	public boolean getEnabled() {
		return this.enabled;
	}
}
