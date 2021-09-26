package two;

public class PrivatePerson {
	
	private String name;
	private int age;
	
	public PrivatePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		PrivatePerson b = new PrivatePerson("Jacob", 33);
		
		System.out.println("Private person is named " + b.getName() + " and his age is " + b.getAge());
	}
}
