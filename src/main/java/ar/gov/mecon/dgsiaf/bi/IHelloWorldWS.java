package ar.gov.mecon.dgsiaf.bi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author mabaez
 *
 */
@WebService
public interface IHelloWorldWS {
	
	@WebMethod(operationName = "sayHelloWorld", action = "http://ar.gov.mecon.dgsiaf.bi/helloWS/doSayHello")
	public String helloWorld(@WebParam  String pNombre);

}
