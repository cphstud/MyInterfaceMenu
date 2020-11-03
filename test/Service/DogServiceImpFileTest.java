package Service;

import Domain.Dog;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DogServiceImpFileTest {

    @Test
    public void getAllDogs() {
        DogServiceImpFile ds = new DogServiceImpFile();
        List<Dog> dogs = ds.getAllDogs();
        int expected = 2;
        int actual = ds.getAllDogs().size();
        assertEquals(expected,actual);
    }
}