package wce.ty.cse.mp2.OpportunityService;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Opportunity{
	
	@Id
	private String projectName;
	private String priority;
	private String rfpStage;
	private String location;
	private Date startDate;
	private Date endDate;
	private String dealSize;
	private String OpportunityTechnologiestecnology;
	private int OpportunityTechnologiesrequiredNumbers;
	private String OpportunityTechnologieslocation;
	private String locationOffShore;
	private String offShoreSecondary;
	private String offShorePrimary;
	private String tech;
	public Opportunity(String projectName, String priority, String rfpStage, String location, Date startDate,
			Date endDate, String dealSize, String opportunityTechnologiestecnology,
			int opportunityTechnologiesrequiredNumbers, String opportunityTechnologieslocation, String locationOffShore,
			String offShoreSecondary, String offShorePrimary, String tech, boolean active) {
		super();
		this.projectName = projectName;
		this.priority = priority;
		this.rfpStage = rfpStage;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dealSize = dealSize;
		OpportunityTechnologiestecnology = opportunityTechnologiestecnology;
		OpportunityTechnologiesrequiredNumbers = opportunityTechnologiesrequiredNumbers;
		OpportunityTechnologieslocation = opportunityTechnologieslocation;
		this.locationOffShore = locationOffShore;
		this.offShoreSecondary = offShoreSecondary;
		this.offShorePrimary = offShorePrimary;
		this.tech = tech;
		this.active = active;
	}


	
	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getPriority() {
		return priority;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getRfpStage() {
		return rfpStage;
	}


	public void setRfpStage(String rfpStage) {
		this.rfpStage = rfpStage;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getDealSize() {
		return dealSize;
	}


	public void setDealSize(String dealSize) {
		this.dealSize = dealSize;
	}


	public String getOpportunityTechnologiestecnology() {
		return OpportunityTechnologiestecnology;
	}


	public void setOpportunityTechnologiestecnology(String opportunityTechnologiestecnology) {
		OpportunityTechnologiestecnology = opportunityTechnologiestecnology;
	}


	public int getOpportunityTechnologiesrequiredNumbers() {
		return OpportunityTechnologiesrequiredNumbers;
	}


	public void setOpportunityTechnologiesrequiredNumbers(int opportunityTechnologiesrequiredNumbers) {
		OpportunityTechnologiesrequiredNumbers = opportunityTechnologiesrequiredNumbers;
	}


	public String getOpportunityTechnologieslocation() {
		return OpportunityTechnologieslocation;
	}


	public void setOpportunityTechnologieslocation(String opportunityTechnologieslocation) {
		OpportunityTechnologieslocation = opportunityTechnologieslocation;
	}


	public String getLocationOffShore() {
		return locationOffShore;
	}


	public void setLocationOffShore(String locationOffShore) {
		this.locationOffShore = locationOffShore;
	}


	public String getOffShoreSecondary() {
		return offShoreSecondary;
	}


	public void setOffShoreSecondary(String offShoreSecondary) {
		this.offShoreSecondary = offShoreSecondary;
	}


	public String getOffShorePrimary() {
		return offShorePrimary;
	}


	public void setOffShorePrimary(String offShorePrimary) {
		this.offShorePrimary = offShorePrimary;
	}


	public String getTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}



	private boolean active;
	
	
	public Opportunity() {
		super();
	}
}
