package wce.ty.cse.mp2.resourceService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@Autowired
	private ResourceService resourceService;
	
	@RequestMapping("/Resources")
	public List<Resources> getAllResources() {
		return resourceService.getAllResources();
	}
	
	
	@RequestMapping("/Resources/{id}")
	public Optional<Resources> getResource(@PathVariable String id) {
		return resourceService.getResource(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/Resources")
	public void addResource(@RequestBody Resources resources) {
		resourceService.addResources(resources);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/Resources/{id}")
	public void updateResource(@RequestBody Resources resources,@PathVariable String id) {
		resourceService.updateResources(id,resources);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/Resources/{id}")
	public void  deleteResources(@PathVariable String id) {
		resourceService.deleteResources(id);
	}
}








