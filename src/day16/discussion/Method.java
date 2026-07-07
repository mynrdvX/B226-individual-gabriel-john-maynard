
package day16.discussion;


public class Method {
    public static void main(String[] args) {
        printName("Summer");
        printName("Spring");
        printName("Winter");
        printName("Fall");
    }

    
    public static void printName(String name){
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
        
    }
    
}

/* 
public static void main(String[] args) {
        //invoke method
        double result = sum(50,50);
        System.out.println("The sum of two numbers is: " + result);
    }
    
    public static int sum(int a, int b){
        return a + b;
    }
*/