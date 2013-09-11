package org.emamotor.ws.soapdemo.server;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author emag
 */
public class EchoServiceTest {

    @Test
    public void testEcho() throws Exception {

        EchoService sut = new EchoService();
        final String message = "Hello";

        String echoMessage = sut.echo(message);

        assertThat(echoMessage, is(message));

    }
}
