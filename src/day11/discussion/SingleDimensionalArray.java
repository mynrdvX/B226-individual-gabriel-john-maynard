package day11.discussion;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        // Syntax for single-dimensional array
        // Collection of ages: 24, 43, 35, 18, 28, 25
        int[] ages = {24, 43, 35, 18, 28, 25};

        // traversing an array using for loop
        System.out.println("For Loop:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // traversing an array using For-Each loop
        System.out.println("For-Each Loop:");
        for (int age : ages) {
            System.out.println(age);
        }

//        // Print a single element (5th element)
//        System.out.println(ages[4]);
//
//        String[] names = {"Michael", "Leslie", "Kent", "Ray", "Jeff"};

 
    }
}