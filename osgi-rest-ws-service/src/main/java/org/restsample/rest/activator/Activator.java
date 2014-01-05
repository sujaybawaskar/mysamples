package org.restsample.rest.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.restsample.rest.resource.MyResource;

public class Activator implements BundleActivator{
	private ServiceRegistration registration;
	public void start(BundleContext ctx) throws Exception {
		MyResource resource = new MyResource();
		registration=ctx.registerService( MyResource.class.getName() , resource , null );
	}

	public void stop(BundleContext ctx) throws Exception {
		registration.unregister();
	}

}
