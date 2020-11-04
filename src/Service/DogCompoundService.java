package Service;

import domain.Dog;
import domain.DogCompound;
import domain.DogNotFoundExeption;

import java.io.FileNotFoundException;
import java.util.List;

public interface DogCompoundService {
    List<Dog> getAllDogs() throws FileNotFoundException;
    void addDogToCompound(DogCompound dogCompound, Dog dog);
    Dog getDogFromCompoundByID(DogCompound dogCompound, int id);
    Dog getDogFromID(int id) throws DogNotFoundExeption;
    List<Dog> getDogsFromID(List<Integer> ids);
    DogCompound getDogCompoundByID(int id);
    List<DogCompound> getAllCompounds();
    double getDogCarePrice(DogCompound dogCompound);
}
