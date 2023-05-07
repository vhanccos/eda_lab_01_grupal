public class JavaArrays {

    
    public static void main(String[] args) {
        
        //Ejercicio 1
        String [] cars={"volvo","BWM","Ford"};
        
        //Ejercicio 2
        System.out.println(cars[1]);
        
        //Ejercicio 3
        cars[0]="Opel";
        System.out.println(cars[0]);
        
        //Ejercicio 4
        System.out.println(cars.length);
        
        //Ejercicio 5
        for(String i:cars){
            System.out.println(i);
        }
        
        //Ejercicio 6
        int[][]myNumbers={{1,2,3,4},{5,6,7}};
    }
    
}
