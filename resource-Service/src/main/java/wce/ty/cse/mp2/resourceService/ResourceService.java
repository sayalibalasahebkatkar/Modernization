package wce.ty.cse.mp2.resourceService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	public List<Resources> getAllResources(){
		List<Resources> resources =new ArrayList<>();
		resourceRepository.findAll()
		.forEach(resources::add);
		return resources;
	}
	
	public Optional<Resources> getResource(String id) {
		return resourceRepository.findById(id);
	}

	public void addResources(Resources resources) {
		resourceRepository.save(resources);
	}

	public void updateResources(String id, Resources resources2) {
		resourceRepository.save(resources2);
		
	}

	public void deleteResources(String id) {
		resourceRepository.deleteById(id);
	}

}
