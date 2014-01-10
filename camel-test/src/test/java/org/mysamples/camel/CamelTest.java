package org.mysamples.camel;

import org.apache.camel.Endpoint;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.spi.ShutdownStrategy;
import org.apache.camel.testng.CamelSpringTestSupport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * 
 * @author sujay
 * 
 */
public class CamelTest extends CamelSpringTestSupport {
	private Endpoint myqueue;

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:META-INF/camel-context.xml" );
//		myqueue = (Endpoint) applicationContext.getBean( "myqueue" );
		context = (ModelCamelContext) applicationContext.getBean( "camelContext" );
		myqueue=context.getEndpoint( "myqueue" );
		
		return applicationContext;
	}

	@Test
	public void testCamel() {
		template.sendBody( myqueue , "hi" );
	}
}
