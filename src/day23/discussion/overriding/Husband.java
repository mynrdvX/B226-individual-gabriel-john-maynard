package day23.discussion.overriding;

public class Husband extends Person {

    @Override
    public void role() {
        System.out.println(
            "I am a Husband. I love, support, and care for my wife."
        );
    }
}