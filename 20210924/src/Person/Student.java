package Person;

public class Student extends Person {
	
	String school;
	
	public Student(String name, Gender gender, String phone, String school) {
		super(name, gender, phone);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + this.getName() 
		+ ", gender=" + this.getPhone() 
		+ ", " + "phone=" + this.getPhone()				
		+"Student [school=" + school + "]";
	}
	
	
}
