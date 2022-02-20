package wce.ty.cse.mp2.resourceService;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resources {

	private String name;
	@Id
	private String Id;
	private String email;
	private String phone_no;
	private String locationOnSite;
	private String locationOffShore;
	private String offShorePrimary;
	private String offShoreSecondary;
	private String employeeType;
	private String lastProject;
	private String allocation;
	private String projectName;
	private String availability;
	private String comments;
	private String grade;
	private String RGSId;
	private String groupCustomer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getLocationOnSite() {
		return locationOnSite;
	}
	public void setLocationOnSite(String locationOnSite) {
		this.locationOnSite = locationOnSite;
	}
	public String getLocationOffShore() {
		return locationOffShore;
	}
	public void setLocationOffShore(String locationOffShore) {
		this.locationOffShore = locationOffShore;
	}
	public String getOffShorePrimary() {
		return offShorePrimary;
	}
	public void setOffShorePrimary(String offShorePrimary) {
		this.offShorePrimary = offShorePrimary;
	}
	public String getOffShoreSecondary() {
		return offShoreSecondary;
	}
	public void setOffShoreSecondary(String offShoreSecondary) {
		this.offShoreSecondary = offShoreSecondary;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getLastProject() {
		return lastProject;
	}
	public void setLastProject(String lastProject) {
		this.lastProject = lastProject;
	}
	public String getAllocation() {
		return allocation;
	}
	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRGSId() {
		return RGSId;
	}
	public void setRGSId(String rGSId) {
		RGSId = rGSId;
	}
	public String getGroupCustomer() {
		return groupCustomer;
	}
	public void setGroupCustomer(String groupCustomer) {
		this.groupCustomer = groupCustomer;
	}
	
	public Resources() {}
	
	public Resources(String name, String Id, String email, String phone_no, String locationOnSite,
			String locationOffShore, String offShorePrimary, String offShoreSecondary, String employeeType,
			String lastProject, String allocation, String projectName, String availability, String comments,
			String grade, String rGSId, String groupCustomer) {
		super();
		this.name = name;
		this.Id = Id;
		this.email = email;
		this.phone_no = phone_no;
		this.locationOnSite = locationOnSite;
		this.locationOffShore = locationOffShore;
		this.offShorePrimary = offShorePrimary;
		this.offShoreSecondary = offShoreSecondary;
		this.employeeType = employeeType;
		this.lastProject = lastProject;
		this.allocation = allocation;
		this.projectName = projectName;
		this.availability = availability;
		this.comments = comments;
		this.grade = grade;
		RGSId = rGSId;
		this.groupCustomer = groupCustomer;
	}
	
	
}
