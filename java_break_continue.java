
public class java_break_continue {
	public static void main(String [] args) {
		
		// ejercicio 5
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		// ejercicio 6
		for (int i = 0; i < 10; i++) {
			
			if (i == 4) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
