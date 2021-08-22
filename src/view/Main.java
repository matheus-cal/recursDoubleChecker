package view;

import controller.ControllerChecker;

public class Main {

	public static void main(String[] args) {
		ControllerChecker ch = new ControllerChecker();
		
		int result = ch.Checker(12224523, 2);
		System.out.println(result);
		
	}

}
