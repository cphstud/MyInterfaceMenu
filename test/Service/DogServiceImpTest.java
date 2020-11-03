package Service;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceImpTest {

    @Test
    public void getAllDogs() {
        DogServiceImp ds = new DogServiceImp();
        int expected = 2;
        int actual = ds.getAllDogs().size();
        assertEquals(expected,actual);
    }
}