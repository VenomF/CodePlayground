package university;

public class Faculty extends Employee {
	
	protected int officeHours;
	protected String rank;
	
	@Override
	public String toString() {
		return "Faculty [" + (name != null ? "name=" + name : "") + "]";
	}

}
