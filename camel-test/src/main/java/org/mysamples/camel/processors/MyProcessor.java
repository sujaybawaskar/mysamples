package org.mysamples.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor{

	public void process(Exchange arg0) throws Exception {
		Thread.sleep( 10000 );
	}

}
