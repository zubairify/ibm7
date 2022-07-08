package ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ex3.Hello;

@Component("stk")
@Scope("singleton")
public class Stock {
	@Autowired
	@Qualifier("hi")	// to inject by name
	private Hello hey;

	public Stock() {
		System.out.println("Stock constructor");
	}
	
	private static Stock stock;
	
	public static Stock get() {
		System.out.println("Stock singleton");
		if(stock == null)
			stock = new Stock();
		
		return stock;
	}
}
