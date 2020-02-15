package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    String name = "Zula";
    Date givenBirthDate = new Date(2020, 2, 4);
    Integer givenId = 0;
    Cat cat = new Cat(name, givenBirthDate, givenId);
    Integer getNumberOfMealsEaten = 1;

    @Test
    public void setNameTest() {
        String givenName = "Zula";
        String retrievedName = cat.getName();
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void setGivenBirthDateTest() {
        Date givenBirthDate = new Date(2020, 2,4);
        Date retrievedBirthDate = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void getIdTest(){
        Integer retrievedId = cat.getId();
        Integer givenId = cat.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest() {
        Integer expected = getNumberOfMealsEaten.compareTo(1);
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catIsInstanceOfAnimalTest() {
        Boolean expected = new Cat("seal", new Date(2038484l), 2) instanceof Animal;
        Assert.assertEquals(expected, true);
    }

    @Test
    public void catIsInstanceOfMammalTest() {
        Boolean expected = new Cat("seal", new Date(2038484l), 2) instanceof Mammal;
        Assert.assertEquals("Testing if Cat is an instance of Mammal",expected, true);
    }

    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
