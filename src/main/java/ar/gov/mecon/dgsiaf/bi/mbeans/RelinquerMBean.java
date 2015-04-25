package ar.gov.mecon.dgsiaf.bi.mbeans;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="bean:name=relinquerbean", description="Relinquer Bean", 
logFile="jmx.log", currencyTimeLimit=15, persistPolicy="OnUpdate", persistPeriod=200,
persistLocation="foo", persistName="bar")
public class RelinquerMBean implements IRelinquerMbean {

    private boolean enabled;


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	@ManagedOperation(description="Relinq")
	public void testRelinquerMbean(){
		
	}
    
    
    @ManagedAttribute(description = "Audit enabled")
    public boolean getEnabled()
    {
       return this.enabled;
    }
}
