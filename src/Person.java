public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    Person(String fn, String ln, int a, String c)
    {
        firstName = fn;
        lastName = ln;
        age = a;
        city = c;
    }


    void increaseAge()
    {
        age++;
    }

    void changeAge(int change)
    {
        age = age + change;
    }

    void showInfo()
    {
        System.out.println("Dane o osobie:\n" + firstName + " " + lastName + " " + age + " " + city);
    }
}
