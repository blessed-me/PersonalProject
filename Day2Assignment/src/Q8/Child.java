package Q8;

public abstract class Child {
	private String name;
	private int age;
	private String gender;
	
	public Child(String name, String gender) {
		
		this.name = name;
		this.gender = gender;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public abstract void setAge();
	public abstract void display();
	
}
