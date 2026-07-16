package day25.discussion.arraylist;

import java.util.ArrayList;

public class ArrayListDiscussion {

    public static void main(String[] args) {
        //
        ArrayList<String> cars = new ArrayList<>();

        // CREATE
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Hyundai");
        cars.add(0, "Mustang");

        System.out.println("After CREATE:");
        System.out.println(cars);


        // READ
        System.out.println("\nAfter READ:");

        // Get first element
        System.out.println("First car: " + cars.get(0));

        // Get last element
        System.out.println("Last car: " + cars.get(cars.size() - 1));


        // UPDATE
        cars.set(1, "Nissan"); // Replace Toyota with Nissan

        System.out.println("\nAfter UPDATE:");
        System.out.println(cars);


        // DELETE
        cars.remove(2); // Remove Ford

        System.out.println("\nAfter DELETE:");
        System.out.println(cars);

    }
}

/*
CRUD OPERATION

C - Create  -> add()
R - Read    -> get()
U - Update  -> set()
D - Delete  -> remove()

*/