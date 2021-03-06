import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    private List<Person> people;

    @Before
    public void setup() {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Amanda", LocalDate.of(1988, 12, 19), Person.Sex.FEMALE, "coolgirl@gmail.com");
        Person person2 = new Person("Hillary", LocalDate.of(1990, 01, 01), Person.Sex.FEMALE, "skillary1@gmail.com");
        people.add(person1);
        people.add(person2);
    }

    @Test
    public void personConstructorTest() {
        //given
        String expectedName = "Pete";
        LocalDate expectedBirthDate = LocalDate.now();
        Person.Sex expectedSex = Person.Sex.MALE;
        String expectedEmailAddress = "pk@aol.com";

        //when
        Person person = new Person(expectedName, expectedBirthDate, expectedSex, expectedEmailAddress);

        person.setName(expectedName);
        String actualName = person.getName();

        person.setBirthday(expectedBirthDate);
        LocalDate actualBirthDate = person.getBirthday();

        person.setGender(expectedSex);
        Person.Sex actualSex = person.getGender();

        person.setEmailAddress(expectedEmailAddress);
        String actualEmailAddress = person.getEmailAddress();

        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedSex, actualSex);
        Assert.assertEquals(expectedEmailAddress, actualEmailAddress);
    }

    @Test
    public void nullaryConstructorTest() {
        //given
        //when
        Person person = new Person();
        //then
        Assert.assertNotNull(person);
    }

    @Test
    public void toStringTest() {
        //given
        Person amanda = new Person("Amanda", LocalDate.of(1988, 12, 19), Person.Sex.FEMALE, "coolgirl@gmail.com");
        String expectedPerson = "java.Person{" +
                "name='Amanda" + '\'' +
                ", birthday=1988-12-19" +
                ", gender=FEMALE" +
                ", emailAddress='coolgirl@gmail.com" + '\'' +
                '}';
        //when
        String actualPerson = amanda.toString();
        //then
        Assert.assertEquals(expectedPerson, actualPerson);

    }

    @Test
    public void getAgeTest() {
        //given
        Person hillary = new Person("Hillary", LocalDate.of(1990, 01, 01), Person.Sex.FEMALE, "skillary1@gmail.com");
        int expectedAge = 30;
        //when
        int actualAge = hillary.getAge();
        //then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void printPersonTest(){
        //given
        Person kyle = new Person();
        //when
        kyle.printPerson();
        //then
        Assert.assertNotNull(kyle);
    }

    @Test
    public void PrintPersonOlderThanTest(){
        //given
        people = new ArrayList<>();
        Person person1 = new Person("Amanda", LocalDate.of(1948, 12, 19), Person.Sex.FEMALE, "coolgirl@gmail.com");
        people.add(person1);
        //when
        Person.printPersonsOlderThan(people, 50);
        //then

    }
    @Test
    public void printPersonsWithinAgeRangeTest(){

        Person.printPersonsWithinAgeRange(people, 30,50);
    }
}
