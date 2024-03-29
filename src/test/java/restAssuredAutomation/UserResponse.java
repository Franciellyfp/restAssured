package restAssuredAutomation;

public class UserResponse {
	private String id;
	private String name;
	private String job;
	private String createdAt;
	
	// Constructor
	public UserResponse() {
	}
	
	// Getters
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	// Setters
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	

}
