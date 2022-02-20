package wce.ty.cse.mp2.OpportunityService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpportunityService {

	@Autowired
	OpportunityRepository opportunityRepository;
	
	private List<Opportunity> opportunity = new ArrayList<>(Arrays.asList(
			new Opportunity("projectName","priority","rfpStage","location",new Date(0),new Date(0),"dealSize",
					"OpportunityTechnologiestecnology",10,"OpportunityTechnologieslocation","locationOffShore",
					"offShoreSecondary","offShorePrimary","tech", false),
			new Opportunity("projectName2","priority","rfpStage","location",new Date(0),new Date(0),"dealSize",
					"OpportunityTechnologiestecnology",20,"OpportunityTechnologieslocation","locationOffShore",
					"offShoreSecondary","offShorePrimary","tech", true)  
		));
	
	public List<Opportunity> getAllOpportunity(){
		List<Opportunity> opportunities=new ArrayList<>();
		
		opportunityRepository.findAll().forEach(opportunities::add);
		return opportunities;
	}
	
	public Optional<Opportunity> getOpportunity(String projectName) {
		return opportunityRepository.findById(projectName);
	}

	public void addOpportunity(Opportunity opportunity2) {
		
		opportunityRepository.save(opportunity2);
	}

	public void updateOpportunity(Opportunity opportunity2, String id) {
		
		opportunityRepository.save(opportunity2);
		
	}

	public void deleteOpportunity(String id) {
		
		opportunityRepository.deleteById(id);
	}
}
