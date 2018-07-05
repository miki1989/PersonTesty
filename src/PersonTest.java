public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 30, "Warszawa");
        System.out.println(person.age);

        person.increaseAge();
        System.out.println(person.age);

        person.changeAge(10);
        System.out.println(person.age);


        System.out.println();
        person.showInfo();
        System.out.println();

        Person person1 = new Person("Wojtek", "Niezgoda", 40, "Rybnik");
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime(person1);
        System.out.println(person1.age);
        timeMachine.timeTravel(person1, 20);
        System.out.println(person1.age);
        person1.showInfo();


    }
}
