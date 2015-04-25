package ar.gov.mecon.dgsiaf.bi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "ar.gov.mecon.dgsiaf.bi.IHelloWorldWS",
serviceName = "HelloWorld")
public class HelloWorldWS implements IHelloWorldWS{

	private static final String HELLO = "Hola ";

	@Override
	@WebMethod(operationName = "sayHelloWorld", action = "http://ar.gov.mecon.dgsiaf.bi/helloWS/doSayHello")
	public String helloWorld(@WebParam String pNombre) {
		
			
			return HELLO + pNombre;
		
	}
	
	

}
