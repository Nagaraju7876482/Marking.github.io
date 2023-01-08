package util;



public class Student {
	private int id;
	private String name;
	private String email;
	private String number;
	private String age;
	public Student()
	{
		
	}
	
	public Student(int id, String name, String email, String number, String age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", age=" + age
				+ "]";
	}
	
}
