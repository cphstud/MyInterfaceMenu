package Service;

import domain.Dog;
import domain.DogCompound;

import java.util.List;

public interface DogCompoundService {
    List<Dog> getAllDogs();
    public void addDogToCompound(DogCompound dogCompound, Dog dog);
    public Dog getDogFromCompoundByID(DogCompound dogCompound, int id);
    List<DogCompound> getAllCompounds();
    double getDogCarePrice(DogCompound dogCompound);
}
