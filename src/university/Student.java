package university;

public class Student extends Person {
	
	protected String classStatus;
	
	public Student(String name, String adress, int phoneNum, String classStatus) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name : "") + "]";
	}

}
