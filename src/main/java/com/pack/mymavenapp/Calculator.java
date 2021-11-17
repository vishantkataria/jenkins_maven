package com.pack.mymavenapp;

public class Calculator {
	
	CalculatorService service;
	
	
	//Constructor
	public Calculator(CalculatorService service) {
		
		this.service = service;
	}



	public int performOps(int a,int b) {
		return service.add(a, b);
		 
	}

}
