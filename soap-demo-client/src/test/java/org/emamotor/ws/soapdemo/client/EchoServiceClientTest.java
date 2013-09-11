package org.emamotor.ws.soapdemo.client;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 * @author emag
 */
public class EchoServiceClientTest {

    @Test
    @Ignore
    public void testEcho() throws Exception {

        EchoServiceClient sut = new EchoServiceClient(null);
        final String message = "Hello";

        String echoMessage = sut.echo(message);

        assertThat(echoMessage, is(message));

    }
}
