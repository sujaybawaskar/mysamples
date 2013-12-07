package com.sbawaska.samples.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author sujay
 * 
 */
public class Main {
	private static Logger LOGGER = LoggerFactory.getLogger( Main.class );

	public static void main(String[] args) {
		// No need for log.isDebugEnabled in this case since parameter
		// construction is done after checking debug flag by the api
		LOGGER.debug( ":" + args );
	}
}
