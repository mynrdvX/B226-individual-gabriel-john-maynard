
package day25.discussion.enumeration;


public class Main {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        Day today = Day.SATURDAY;

        if (today == Day.MONDAY || today == Day.TUESDAY) {
            System.out.println("Start of the week");
        } else if (today == Day.WEDNESDAY || today == Day.THURSDAY) {
            System.out.println("It's midweek");
        } else if (today == Day.FRIDAY) {
            System.out.println("Weekend is near");
        } else {
            System.out.println("Weekend!");
        }
    }
}
