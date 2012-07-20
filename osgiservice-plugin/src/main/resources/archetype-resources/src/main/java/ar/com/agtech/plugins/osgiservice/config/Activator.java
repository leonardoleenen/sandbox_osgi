package ar.com.agtech.plugins.osgiservice.config;


import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {
	

	@Override
	public void start(BundleContext context) throws Exception {
		System.out
				.println("OSGI PlugIn Registerd");
		Dictionary props = new Hashtable();
		props.put("osgi.remote.interfaces", "*");

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("OSGI PlugIn UnRegistered");
		

	}


}
