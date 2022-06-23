
public class Person implements Cloneable {
	private String name;
	private int age;
	
	public Person() {
		// Call another constructor within the class
		this("Anonymous", -1);	// Constructor chaining..
	}
	
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age)
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("Polo", 21);
		
		Person pc = (Person) p.clone();
		
		System.out.println(pc);
	}
}
