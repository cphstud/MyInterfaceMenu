package Service;

import domain.Dog;
import domain.Order;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BestillingsServiceFileImplTest {


    @Test
    public void writeToStorage() {
        BestillingsService bs = new BestillingsServiceFileImpl();
        DogCompoundService ds = new DogCompoundServiceImpl();
        try {

            List<Dog> dogs = ds.getAllDogs();
            ArrayList<Order> orders = new ArrayList<>();
            int phone = 123123;
            int phone2 = 323123;

            Order order = new Order(dogs.get(1), phone);
            Order order2 = new Order(dogs.get(0), phone);
            ArrayList<Order> bestillinger = new ArrayList<>();
            bestillinger.add(order);
            bestillinger.add(order2);
            bs.writeToStorage(bestillinger);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}