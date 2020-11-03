package Service;

import domain.Dog;
import domain.DogCompound;

import java.util.ArrayList;
import java.util.List;

public class DogCompoundServiceImpl implements DogCompoundService{
    @Override
    public List<Dog> getAllDogs() {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
        Dog dog2 = new Dog(60736,"Fawn","Greyhound","LADY","Desexed Female","ELIZABETH NORTH");
        Dog dog3 = new Dog(101440,"Gold","Golden Retriever","GRACE","Female","CRAIGMORE");
        return dogs;
    }

    @Override
    public void addDogToCompound(DogCompound dogCompound, Dog dog) {
        dogCompound.addDog(dog);

    }

    @Override
    public Dog getDogFromCompoundByID(DogCompound dogCompound, int id) {
        return null;
    }

    @Override
    public DogCompound getDogCompoundByID(int id) {
        return null;
    }

    @Override
    public List<DogCompound> getAllCompounds() {
        List<DogCompound> dogCompounds = new ArrayList<>();
        DogCompound compound = new DogCompound(1,2,"CRAIGMORE");
        return dogCompounds;
    }

    @Override
    public double getDogCarePrice(DogCompound dogCompound) {
        return 0;
    }
}
