# SOAP demo

## What is this?

This is a SOAP demo using Maven plugin.
The Apps are very simple(Only Echo function).

## Requirments

* Maven 3.X
* JDK6 or later

## Running Apps

### Build

~~~
$ git clone https://github.com/emag/soap-demo.git
$ cd soap-demo
$ mvn clean package
~~~

### Deploy Server App on JBoss

#### EAP 4.3

~~~
$ cp soap-demo-server/target/soap-demo-server.war $JBOSS_EAP43_PROFILE/deploy
$ cd $JBOSS_EAP43_HOME/bin
$ ./run.sh -c $PROFILE_NAME
~~~

##### CAUTION

If you use EAP4.3_CP09 or earlier you have to do copy some JBoss libraries into $JBOSS_EAP43_HOME/lib/endorsed.

~~~
$ cp $JBOSS_EAP43_PROFILE/{jboss-jaxrpc.jar,jboss-jaxws.jar,jboss-saaj.jar} $JBOSS_EAP43_HOME/lib/endorsed
~~~

#### AS7/EAP6

##### Using CLI

~~~
$ cd $JBOSS_AS7EAP6_HOME/bin
$ ./standalone.sh
$ ./jboss-cli.sh -c --command="deploy $SOAP_DEMO/soap-demo-server/target/soap-demo-server.war"
~~~

##### Using File System Deploy

~~~
$ cp soap-demo-server/target/soap-demo-server.war $JBOSS_AS7EAP6_HOME/standalone/deployments
$ cd $JBOSS_AS7EAP6_HOME/bin
$ ./standalone.sh
~~~

### Running Client App

~~~
$ java -jar $SOAP_DEMO/soap-demo-client/target/soap-demo-client.jar 1 2 3 4 5
1
2
3
4
5
~~~

## Reference

* [wsprovide - JBoss Community](https://docs.jboss.org/author/display/JBWS/wsprovide)
* [wsconsume - JBoss Community](https://docs.jboss.org/author/display/JBWS/wsconsume)
