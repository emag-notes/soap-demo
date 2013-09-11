package org.emamotor.ws.soapdemo.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author emag
 */
@WebService(name = "EchoServicePortType", serviceName = "EchoService")
public class EchoService {

    @WebMethod
    public String echo(String input) {
        return input;
    }

}
