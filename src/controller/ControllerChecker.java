package controller;

public class ControllerChecker {

	public ControllerChecker() {
		super();
	}
	
	int result = 0;
		
	public int Checker(int n1, int n2) {
		if (n1 == 0) {
			return 1;
		} else {
			if (n2 == n1 % 10) {
				result++;
			}
			
			Checker(n1 / 10, n2);
			
			return result;
			
		}
	}

}
