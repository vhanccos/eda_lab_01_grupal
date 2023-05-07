public class Method{


public static void main(String[] args) {
	//ejer3
	  myMethod("John");
	//ejer4
	  System.out.println(myMethod(3));
	//ejer5
	  
	  checkAge(20);
	  
}


static void myMethod(String fname) {

	   System.out.println(fname+ " Doe");}

static int myMethod(int x) {
	  
	return 5 + x;
}

static void checkAge(int age) {
  
	if(age < 18) {
        System.out.println("Access denied");
	 } 
	else{
        System.out.println("Access granted"); 
			   }
 }

}
