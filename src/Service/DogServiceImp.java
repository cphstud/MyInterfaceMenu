package Service;

import Domain.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogServiceImp implements DogService{
    private List<Dog> dogs;

    public DogServiceImp() {
        dogs = new ArrayList<>();
        initDogs();
    }

    public void initDogs() {
        Dog dog = new Dog(20990,"Red","Dobermann","AMY","Desexed Female","WATERLOO CORNER");
        Dog dog1 = new Dog(26898,"Blenheim","Spaniel","SAMO","Male","HILLIER");
        dogs.add(dog);
        dogs.add(dog1);
        }


    @Override
    public List<Dog> getAllDogs() {
        return dogs;
    }
}
