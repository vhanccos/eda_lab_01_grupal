
public class java_if_else {
	public static void main(String [] args) {
		
		// ejercicio 1
		int x = 50;
		int y = 10;
		if (x > y) {
			System.out.println("Hello World");
		}
		
		// ejercicio 2
		int x = 50;
		int y = 50;
		if (x == y) {
			System.out.println("Hello World");
		}
		
		// ejercicio 3
		int x = 50;
		int y = 50;
		if (x == y) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		// ejercicio 4
		int x = 50;
		int y = 50;
		if (x == y) {
			System.out.println("1");
		}
		else if (x > y){
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
		
		// ejercicio 5
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result); 
		
	}

}
