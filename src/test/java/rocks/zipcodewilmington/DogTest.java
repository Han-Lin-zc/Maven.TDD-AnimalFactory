package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    private String givenName = "Milo";
    private Date givenBirthDate = new Date(102193);
    private Integer givenId = 1;
    Dog dog = new Dog(givenName, givenBirthDate, givenId);
    Integer getNumberOfMealsEaten = 1;

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakDogTest() {
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGivenBirthDateTest() {
        Date givenBirthDate = new Date(102193);
        Date retrievedBirthDate = dog.getBirthDate();
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void eatTest() {
        Integer expected = getNumberOfMealsEaten.compareTo(1);
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getIdTest(){
        Integer retrievedId = dog.getId();
        Integer givenId = dog.getId();
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void isDogInstanceOfAnimalTest() {
        boolean expected = new Dog("Milo",new Date(102112), 2) instanceof Animal;
        Assert.assertEquals(expected, true);
    }

    @Test
    public void isDogInstanceOfMammalTest() {
        boolean expected = new Dog("Milo",new Date(102112), 2) instanceof Mammal;
        Assert.assertEquals(expected, true);
    }



    @Test
    public void constructorTest() {

        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
