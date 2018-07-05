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
    }
}
