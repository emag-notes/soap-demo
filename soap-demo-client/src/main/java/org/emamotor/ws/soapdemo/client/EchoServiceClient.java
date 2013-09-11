package org.emamotor.ws.soapdemo.client;

import org.emamotor.ws.soapdemo.server.EchoService;
import org.emamotor.ws.soapdemo.server.EchoServicePortType;

/**
 * @author emag
 */
public class EchoServiceClient {

    EchoServicePortType _portType;

    public EchoServiceClient(EchoServicePortType portType) {
        _portType = portType;
    }

    public String echo(String message) {
        return _portType.echo(message);
    }

    private static EchoServicePortType createPortType(EchoService echoService) {
        return echoService.getEchoServicePortTypePort();
    }

    ////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Standalone entry point
     * @param args
     */
    public static void main(String... args) {

        if (args.length <= 0) usage();

        EchoServiceClient client = new EchoServiceClient(createPortType(new EchoService()));

        client.printArgs(args);

    }

    private void printArgs(String... args) {
        for(String arg : args) {
            System.out.println(echo(arg));
        }
    }

    private static void usage() {
        System.err.println("It is necessary to give some args.");
        System.exit(1);
    }

}
