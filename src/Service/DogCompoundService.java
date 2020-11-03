package Service;

import domain.Dog;
import domain.DogCompound;

import java.io.FileNotFoundException;
import java.util.List;

public interface DogCompoundService {
    List<Dog> getAllDogs() throws FileNotFoundException;
    void addDogToCompound(DogCompound dogCompound, Dog dog);
    Dog getDogFromCompoundByID(DogCompound dogCompound, int id);
    Dog getDogFromID(int id);
    DogCompound getDogCompoundByID(int id);
    List<DogCompound> getAllCompounds();
    double getDogCarePrice(DogCompound dogCompound);
}
