package day23.discussion.overriding;

public class Child extends Person {

    @Override
    public void role() {
        System.out.println(
            "I am a Child. I respect, obey, and learn from my parents."
        );
    }
}