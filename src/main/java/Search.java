import java.util.List;

public class Search implements CheckPerson {

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        Person.Sex isFemale = Person.Sex.FEMALE;
        boolean isBorn = p.getAge() >= 0;
        boolean isYoungerThan80 = p.getAge() <= 80;
        return p.gender == isFemale && isBorn && isYoungerThan80;
    }
}
