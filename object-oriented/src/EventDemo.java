
class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("Class level implementation");
	}
}

public class EventDemo {
	
	class InnerEventImpl implements Event {

		@Override
		public void perform() {
			System.out.println("Inner class implementation");
		}
	}

	static class StaticInnerEventImpl implements Event {

		@Override
		public void perform() {
			System.out.println("Static inner class implementation");
		}
	}
	
	public void nestedEvent() {
		class NestedEventImpl implements Event {

			@Override
			public void perform() {
				System.out.println("Nested class implementation");
			}
		};
		new NestedEventImpl().perform();
	}
	
	public void oneMoreEvent() {
		Event e = new Event () {
			@Override
			public void perform() {
				System.out.println("Anonymous inner class implementation");
			}
		};
		e.perform();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Lambda event implementation");
		e.perform();
	}
	
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.perform();
		
		EventDemo demo = new EventDemo();
		InnerEventImpl e2 = demo.new InnerEventImpl();
		e2.perform();
		
		EventDemo.StaticInnerEventImpl e3 = new EventDemo.StaticInnerEventImpl();
		e3.perform();
		
		demo.nestedEvent();
		demo.oneMoreEvent();
		demo.oneLastEvent();
	}
}
