package day9.discussion;

public class ForLoopStatement {

    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }

        System.out.println("The total product of numbers 1 to 5 is: " + product);


    }
}