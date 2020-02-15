package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    Cat appa = new Cat("Appa",new Date(102120), 2);


    @Before
    public void setUp() {
        CatHouse.add(appa);
    }

    @After
    public void clearAfter() {
        CatHouse.clear();
    }


    @Test
    public void catAddTest() {
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1,actual);
    }

    @Test
    public void catRemoveByIdTest() {
        CatHouse.remove(2);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(0,actual);
    }

    @Test
    public void catRemoveAnimalTest() {
        CatHouse.remove(appa);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(0,actual);
    }


    @Test
    public void getCatByIdTest() {
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(appa,actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1,actual);
    }

}
