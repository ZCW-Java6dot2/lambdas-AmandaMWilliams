import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Before
    public void setup(){
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Amanda", LocalDate.of(1988, 12, 19), Person.Sex.FEMALE, "coolgirl@gmail.com");
        Person person2 = new Person("Hillary", LocalDate.of(1990, 01,01), Person.Sex.FEMALE, "skillary1@gmail.com");
    }

    @Test
    public void personConstructorTest(){
        //given
        String expectedName = "Pete";
        LocalDate expectedBirthdate = LocalDate.now();
        Person.Sex expectedSex = Person.Sex.MALE;
        String expectedEmailAddress = "pk@aol.com";
        //when
        Person person = new Person(expectedName, expectedBirthdate, expectedSex, expectedEmailAddress);
        person.setName(expectedName);
        String actualName = person.getName();
        person.setBirthday(expectedBirthdate);
        LocalDate actualBirthdate = person.getBirthday();
        person.setGender(expectedSex);
        Person.Sex actualSex = person.getGender();
        person.setEmailAddress(expectedEmailAddress);
        String actualEmailAddress = person.getEmailAddress();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
        Assert.assertEquals(expectedSex, actualSex);
        Assert.assertEquals(expectedEmailAddress, actualEmailAddress);
    }
}
