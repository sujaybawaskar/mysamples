package org.mysamples.camel.amqclient;

import org.apache.camel.Endpoint;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("scheduledBean")

public class ScheduleClientBean {
	@Autowired
	private ProducerTemplate template;
	@Autowired
	private Endpoint queue1;
	int i=0;
	@Scheduled(fixedDelay=10000)
	public void produceMessages(){
		for(int j=0;j<100000;j++){
			template.sendBody(queue1,"Message id = "+(i+j));
		}
		i+=10000;
	}
}
