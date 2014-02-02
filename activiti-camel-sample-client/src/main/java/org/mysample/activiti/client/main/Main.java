package org.mysample.activiti.client.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"client-context.xml" );
		JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean( "jmsTemplate" );
		jmsTemplate.convertAndSend( "frontEndQueue" , "hi" );
	}

}
