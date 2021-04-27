package client.eureka;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ist der Aufrufer des registrierten Service
 * sollte in einem eigenen Service rein(maven Module) wäre sauberer und verständlicher
 * @author ahmadobeidi
 *
 */

@RestController
class ServiceInstanceRestController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		System.out.println(applicationName);
		return this.discoveryClient.getInstances(applicationName);
	}
}