package Service;

import domain.Dog;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class DogCompoundServiceFileDBTest {

    @Test
    public void getAllDogs() {
        DogCompoundServiceFileDB db = new DogCompoundServiceFileDB();
        try {
            List<Dog> dogs = db.getAllDogs();
            int expected = 23;
            int actual = dogs.size();
            assertEquals(expected,actual);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}