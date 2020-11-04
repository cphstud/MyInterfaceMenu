package Service;

import domain.Dog;
import domain.DogCompound;
import domain.DogNotFoundExeption;

import java.util.ArrayList;
import java.util.List;

public class DogCompoundServiceImpl implements DogCompoundService{
    // TODO: make this singleton
    private final List<Dog> dogs = new ArrayList<>();

    public DogCompoundServiceImpl() {
        initDogs();
    }

    public void initDogs() {
        Dog dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
        Dog dog2 = new Dog(60736,"Fawn","Greyhound","LADY","Desexed Female","ELIZABETH NORTH");
        Dog dog3 = new Dog(101440,"Gold","Golden Retriever","GRACE","Female","CRAIGMORE");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
    }

    @Override
    public List<Dog> getAllDogs() {
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
    public Dog getDogFromID(int id) throws DogNotFoundExeption {
        Dog tmpDog = null;
        try {
            tmpDog = getDogFromID(id);
        } catch (DogNotFoundExeption e) {
            throw new DogNotFoundExeption("Dog not found");
        }
        return tmpDog;
    }

    @Override
    public List<Dog> getDogsFromID(List<Integer> ids) {
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
