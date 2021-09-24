package Person;

public class Worker extends Person{
	String company;
	public Worker(String name, Gender gender, String phone, String company) {
		super(name, gender, phone);
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		
		return "Worker [name=" + this.getName() 
		+ ", gender=" + this.getGender() 
		+ ", phone=" + this.getPhone()
		+"Worker [company=" +company + "]";
	}
	
}
