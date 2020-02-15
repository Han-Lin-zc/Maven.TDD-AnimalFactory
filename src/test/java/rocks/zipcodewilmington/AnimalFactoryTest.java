package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void animalFactoryCreateDogTest() {
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "spot";
        Date birthDate = new Date(102120);
        Dog puppy = animalFactory.createDog(name, birthDate);
        boolean isDog = puppy instanceof Dog;

        Assert.assertEquals("Testing if create dog return animal factory",true, isDog);
        Assert.assertEquals(name, puppy.getName());
        Assert.assertEquals(birthDate, puppy.getBirthDate());
    }

    @Test
    public void animalFactoryCreateCatTest() {
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "mitten";
        Date birthDate = new Date(102120);
        Cat kitten = animalFactory.createCat(name, birthDate);
        boolean isCat = kitten instanceof Cat;

        Assert.assertEquals("Testing if create dog return animal factory",true, isCat);
        Assert.assertEquals(name, kitten.getName());
        Assert.assertEquals(birthDate, kitten.getBirthDate());

    }
}
