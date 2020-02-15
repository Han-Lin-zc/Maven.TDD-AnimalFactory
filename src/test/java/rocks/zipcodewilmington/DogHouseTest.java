package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    Dog puppy = new Dog("Milo",new Date(102112),1);

    @Before
    public void setUp() {
        DogHouse.add(puppy);
    }

    @After
    public void clearAfter() {
        DogHouse.clear();
    }

    @Test
    public void dogAddTest() {
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1,actual);
    }

    @Test
    public void dogRemoveByIdTest() {
        DogHouse.remove(1);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(0,actual);
    }

    @Test
    public void dogRemoveAnimalTest(){
        DogHouse.remove(puppy);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(0,actual);
    }

    @Test
    public void getDogByIdTest() {
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(puppy,actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1,actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
