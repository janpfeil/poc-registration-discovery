package caller;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/client")
class ServiceDiscoveryRestController {

    private final DiscoveryClient discoveryClient;

    public ServiceDiscoveryRestController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    /**
     * Discover Service by applicationName.
     *
     * @param applicationName
     * @return List of ServiceInstance
     */
    @Operation(description = "discover service by application name")
    @GetMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        System.out.println(applicationName);
        return this.discoveryClient.getInstances(applicationName);
    }

    /**
     * List all service names.
     *
     * @return List of service names
     */
    @Operation(description = "list all registered service names")
    @GetMapping("/services")
    public List<String> serviceNames() {
        return this.discoveryClient.getServices();
    }
}
