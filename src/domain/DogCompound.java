package domain;

import java.util.ArrayList;
import java.util.List;

public class DogCompound {
    List<Dog> dogs;
    String location;
    int capacity;

    public DogCompound(int capacity, String location) {
        this.dogs = new ArrayList<>();
        this.location = location;
        this.capacity = capacity;
    }

    public void addDog(Dog dog) {
        // TODO: tjek size
        // TODO: create CompoundFullException size
        dogs.add(dog);
    }
}
