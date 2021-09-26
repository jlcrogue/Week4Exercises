package three;

public class TalkablePerson {
	
	public String name;
	public int age;
	
	public TalkablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		
		System.out.println("Hello my name is: " + name);
	}
}
