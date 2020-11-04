package Service;

import domain.Dog;
import domain.DogNotFoundExeption;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogCompoundServiceImplTest {
    Dog dog;

    @Test
    public void getDogFromID() {
        DogCompoundServiceImpl ds = new DogCompoundServiceImpl();
        int id = 1;
        try {
            dog = ds.getDogFromID(id);
        } catch (DogNotFoundExeption e) {
            e.printStackTrace();
        }
        System.out.println("test");
    }
}