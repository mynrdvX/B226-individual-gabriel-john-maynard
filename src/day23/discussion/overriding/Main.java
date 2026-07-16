package day23.discussion.overriding;

public class Main {

    public static void main(String[] args) {

        // Parent class object
        Person person = new Person();

        // Parent reference variables holding child objects
        Person father = new Father();
        Person husband = new Husband();
        Person child = new Child();

        person.role();
        father.role();
        husband.role();
        child.role();
    }
}