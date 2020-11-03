package Service;

import domain.Dog;
import domain.DogCompound;

import java.io.FileNotFoundException;
import java.util.List;

public interface DogCompoundService {
    List<Dog> getAllDogs() throws FileNotFoundException;
    public void addDogToCompound(DogCompound dogCompound, Dog dog);
    public Dog getDogFromCompoundByID(DogCompound dogCompound, int id);
    public Dog getDogFromID(int id);
    public DogCompound getDogCompoundByID(int id);
    List<DogCompound> getAllCompounds();
    double getDogCarePrice(DogCompound dogCompound);
}
