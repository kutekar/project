package project.te.assignemet;

public class ContactFile {
	private String name;
	private long number;
	private  String group;
	public ContactFile(String name, long number, String group) {
		super();
		this.name = name;
		this.number = number;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	

}
