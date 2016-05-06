import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		String operator;
		Scanner scan = new Scanner(System.in);
		calculator calc = new calculator();
		System.out.println("Please Enter Value of x: ");
		a = scan.nextInt();
		System.out.println("Please Enter Value of y: ");
		b = scan.nextInt();
		System.out.println("Please Enter Math Operator: ");
		operator = scan.next();
		System.out.println("Result: "+calc.calculate(a, b, operator));
	}
}

class calculator{
	int result;
	
	int calculate(int a, int b, String operator){
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a/b;
			break;
		default:
			System.out.println("Please enter correct math operator (+ - * /)");
		}
		return result;
	}
	
}