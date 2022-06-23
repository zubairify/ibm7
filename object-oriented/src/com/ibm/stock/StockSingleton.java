package com.ibm.stock;

public final class StockSingleton {

	private StockSingleton() {
	}
	
	private static Stock stk;
	
	public static Stock getStock() {
		// Write a logic in such a way that only one object is created 
		// Reference of which is returned every time.
	
		if(stk == null)
			stk = new Stock();
		
		return stk;
	}
}
