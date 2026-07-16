
package day24.discussion.abstractclass;

// Concrete Class / Non-Abstract method
public class Father extends Person {
    
    @Override
    public void role() {
        System.out.println("I am a father. I provide "
                + "support and protect my family.");
    }
    
}
