package wce.ty.cse.mp2.OpportunityService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpportunityController {

	@Autowired
	private OpportunityService opportunityservice;
	
	@RequestMapping("/Opportunity")
	public List<Opportunity> getAllOpportunity() {
		return opportunityservice.getAllOpportunity();
	}
	
	@RequestMapping("/Opportunity/{id}")
	public Optional<Opportunity> getOpportunity(@PathVariable String id) {
		return opportunityservice.getOpportunity(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/Opportunity")
	public void addOpportunity(@RequestBody Opportunity opportunity) {
		opportunityservice.addOpportunity(opportunity);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,value="/Opportunity/{id}")
	public void updateOpportunity(@RequestBody Opportunity opportunity,@PathVariable String id) {
		opportunityservice.updateOpportunity(opportunity,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value="/Opportunity/{id}")
	public void deleteOpportunity(@PathVariable String id) {
		opportunityservice.deleteOpportunity(id);
	}
}
