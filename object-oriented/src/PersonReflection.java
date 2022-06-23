import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
		
//		Person p1 = new Person("Kim", 29);
//		Class pc = p1.getClass();	// Getting the class of the object
		
		Class pc = Class.forName("Person");	// Loading class manually
		
		System.out.println(pc.getName());
		
		System.out.println("-- List of constructors");
		Constructor[] constructors = pc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("-- List of methods");
		Method[] methods = pc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("-- List of methods of Person class");
		Method[] decMethods = pc.getDeclaredMethods();
		for (Method m : decMethods) {
			System.out.println(m);
		}
		
		// print all the fields
		System.out.println("-- List of fields");
		Field[] fields = pc.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
